package opcionOperacionGeometriaEuclidianaUsuario;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class TresAngulosCuadrilateroServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public TresAngulosCuadrilateroServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String angulo1 = request.getParameter("angulo1");
		String angulo2 = request.getParameter("angulo2");
		String angulo3 = request.getParameter("angulo3");
		TresAngulosCuadrilatero objeto3angulosCuadrilatero = new TresAngulosCuadrilatero(angulo1, angulo2, angulo3);
		HttpSession httpSession = request.getSession();
		httpSession.setAttribute("OBJETO3ANGULOSCUADRILATERO", objeto3angulosCuadrilatero);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/resultadoAnguloCuadrilatero.jsp");
		dispatcher.forward(request, response);		
		
	}

}
