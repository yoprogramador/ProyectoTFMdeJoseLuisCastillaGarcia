package opcionOperacionAritmeticaUsuario;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class DivisionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public DivisionServlet() {
        super();
    }
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String numerador = request.getParameter("numerador");
		String denominador = request.getParameter("denominador");
		Division objetoDivision = new Division(numerador, denominador);
		HttpSession httpSession = request.getSession();
		httpSession.setAttribute("OBJETODIVISION", objetoDivision);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/resultadoDivision.jsp");
		dispatcher.forward(request, response);				
	}






}
