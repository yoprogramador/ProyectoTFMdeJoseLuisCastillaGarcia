package opcionOperacionAritmeticaUsuario;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class OperacionAritmeticaUsuarioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public OperacionAritmeticaUsuarioServlet() {
        super();
    }
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String operacionAritmetica = request.getParameter("operacionAritmetica");
		OperacionAritmeticaUsuario objetoOperacionAritmetica = new OperacionAritmeticaUsuario(operacionAritmetica);
		HttpSession httpSession = request.getSession();
		httpSession.setAttribute("OBJETOOPERACIONARITMETICA", objetoOperacionAritmetica);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/formularioCalculadora2.jsp");
		dispatcher.forward(request, response);		
	}





}
