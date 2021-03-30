package opcionOperacionAritmeticaUsuario;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class PotenciacionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;       

    public PotenciacionServlet() {
        super();
    }
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String base = request.getParameter("base");
		String exponente = request.getParameter("exponente");
		Potenciacion objetoPotencia = new Potenciacion(base, exponente);
		HttpSession httpSession = request.getSession();
		httpSession.setAttribute("OBJETOPOTENCIA", objetoPotencia);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/resultadoPotenciacion.jsp");
		dispatcher.forward(request, response);		
	}



}
