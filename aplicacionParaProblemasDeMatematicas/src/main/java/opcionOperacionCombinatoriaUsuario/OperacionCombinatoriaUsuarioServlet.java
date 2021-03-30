package opcionOperacionCombinatoriaUsuario;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class OperacionCombinatoriaUsuarioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public OperacionCombinatoriaUsuarioServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String operacionCombinatoria = request.getParameter("operacionCombinatoria");
		OperacionCombinatoriaUsuario objetoOperacionCombinatoria = new OperacionCombinatoriaUsuario(operacionCombinatoria);
		HttpSession httpSession = request.getSession();
		httpSession.setAttribute("OBJETOOPERACIONCOMBINATORIA", objetoOperacionCombinatoria);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/formularioCalculadora6.jsp");
		dispatcher.forward(request, response);		

	}

}
