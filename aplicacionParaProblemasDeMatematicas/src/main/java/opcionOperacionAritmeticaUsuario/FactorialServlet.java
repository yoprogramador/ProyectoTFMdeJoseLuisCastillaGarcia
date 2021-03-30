package opcionOperacionAritmeticaUsuario;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class FactorialServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public FactorialServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String numero = request.getParameter("numero");
		Factorial objetoFactorial = new Factorial(numero);
		HttpSession httpSession = request.getSession();
		httpSession.setAttribute("OBJETOFACTORIAL", objetoFactorial);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/resultadoFactorial.jsp");
		dispatcher.forward(request, response);				

	}

}
