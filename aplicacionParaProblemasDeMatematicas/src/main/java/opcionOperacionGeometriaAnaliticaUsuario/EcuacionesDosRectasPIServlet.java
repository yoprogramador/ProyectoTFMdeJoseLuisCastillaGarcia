package opcionOperacionGeometriaAnaliticaUsuario;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class EcuacionesDosRectasPIServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public EcuacionesDosRectasPIServlet() {
        super();       
    }
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String coeficienteA1 = request.getParameter("valorArecta1");
		String terminoIndependienteB1 = request.getParameter("valorBrecta1");	
		String coeficienteA2 = request.getParameter("valorArecta2");
		String terminoIndependienteB2 = request.getParameter("valorBrecta2");
		EcuacionesDosRectas ecuacionesDosRectas = new EcuacionesDosRectas(coeficienteA1, terminoIndependienteB1, coeficienteA2, terminoIndependienteB2);
		HttpSession httpSession = request.getSession();
		httpSession.setAttribute("ECUACIONESDOSRECTAS", ecuacionesDosRectas);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/resultadoInterseccionRectas.jsp");
		dispatcher.forward(request, response);
		
	}

}
