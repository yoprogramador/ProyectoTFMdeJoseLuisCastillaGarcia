package opcionOperacionGeometriaAnaliticaUsuario;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class CoordenadasDosPuntosRecServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public CoordenadasDosPuntosRecServlet() {
        super();
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String valorXpunto1 = request.getParameter("valorXpunto1");
		String valorYpunto1 = request.getParameter("valorYpunto1");
		String valorXpunto2 = request.getParameter("valorXpunto2");
		String valorYpunto2 = request.getParameter("valorYpunto2");		
		CoordenadasDosPuntos coordenadasDosPuntos = new CoordenadasDosPuntos(valorXpunto1, valorYpunto1, valorXpunto2, valorYpunto2);
		HttpSession httpSession = request.getSession();
		httpSession.setAttribute("COORDENADASDOSPUNTOS", coordenadasDosPuntos);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/resultadoRecta.jsp");
		dispatcher.forward(request, response);
	}

}
