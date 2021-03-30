package opcionOperacionAritmeticaUsuario;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class RestaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public RestaServlet() {
        super();
    }
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String minuendo = request.getParameter("minuendo");
		String sustraendo = request.getParameter("sustraendo");
		Resta objetoResta = new Resta(minuendo, sustraendo);
		HttpSession httpSession = request.getSession();
		httpSession.setAttribute("OBJETORESTA", objetoResta);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/resultadoResta.jsp");
		dispatcher.forward(request, response);		
	}
	

}
