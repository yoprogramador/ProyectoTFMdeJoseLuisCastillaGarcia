package opcionOperacionEstadisticaUsuario;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class OperacionEstadisticaUsuarioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public OperacionEstadisticaUsuarioServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String operacionEstadistica = request.getParameter("operacionEstadistica");
		OperacionEstadisticaUsuario objetoOperacionEstadistica = new OperacionEstadisticaUsuario(operacionEstadistica);
		HttpSession httpSession = request.getSession();
		httpSession.setAttribute("OBJETOOPERACIONESTADISTICA", objetoOperacionEstadistica);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/formularioCalculadora7.jsp");
		dispatcher.forward(request, response);		

	}

}
