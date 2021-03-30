package opcionOperacionProporcionalidadUsuario;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



public class OperacionProporcionalidadUsuarioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public OperacionProporcionalidadUsuarioServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String operacionProporcionalidad = request.getParameter("operacionProporcionalidad");
		OperacionProporcionalidadUsuario objetoOperacionProporcionalidad = new OperacionProporcionalidadUsuario(operacionProporcionalidad);
		HttpSession httpSession = request.getSession();
		httpSession.setAttribute("OBJETOOPERACIONPROPORCIONALIDAD", objetoOperacionProporcionalidad);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/formularioCalculadora4.jsp");
		dispatcher.forward(request, response);		
	}
	




}
