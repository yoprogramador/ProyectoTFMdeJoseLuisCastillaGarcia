package opcionOperacionGeometriaAnaliticaUsuario;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class CoordenadasUnPuntoEcuacionRectaBisServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public CoordenadasUnPuntoEcuacionRectaBisServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String valorXpunto = request.getParameter("valorXpunto");
		String valorYpunto = request.getParameter("valorYpunto");
		String coeficienteA = request.getParameter("coeficienteA");
		String terminoIndependienteB = request.getParameter("terminoIndependienteB");	
		CoordenadasUnPuntoEcuacionRecta coordenadasUnPuntoEcuacionRecta = new CoordenadasUnPuntoEcuacionRecta(valorXpunto, valorYpunto, coeficienteA, terminoIndependienteB);
		HttpSession httpSession = request.getSession();
		httpSession.setAttribute("COORDENADASUNPUNTOECUACIONRECTA", coordenadasUnPuntoEcuacionRecta);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/resultadoRectaPerpendicular.jsp");
		dispatcher.forward(request, response);
		
	}

}
