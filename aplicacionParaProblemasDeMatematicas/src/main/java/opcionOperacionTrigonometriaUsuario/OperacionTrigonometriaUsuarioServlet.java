package opcionOperacionTrigonometriaUsuario;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class OperacionTrigonometriaUsuarioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public OperacionTrigonometriaUsuarioServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String operacionTrigonometria = request.getParameter("operacionTrigonometria");
		OperacionTrigonometriaUsuario objetoOperacionTrigonometria = new OperacionTrigonometriaUsuario(operacionTrigonometria);
		HttpSession httpSession = request.getSession();
		httpSession.setAttribute("OBJETOOPERACIONTRIGONOMETRIA", objetoOperacionTrigonometria);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/formularioCalculadora8.jsp");
		dispatcher.forward(request, response);		
		
	}

}
