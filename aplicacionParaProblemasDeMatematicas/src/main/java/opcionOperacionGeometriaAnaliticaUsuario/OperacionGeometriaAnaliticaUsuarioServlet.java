package opcionOperacionGeometriaAnaliticaUsuario;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



public class OperacionGeometriaAnaliticaUsuarioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public OperacionGeometriaAnaliticaUsuarioServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String operacionGeometriaAnalitica = request.getParameter("operacionGeometriaAnalitica");
		OperacionGeometriaAnaliticaUsuario objetoGeometriaAnalitica  = new OperacionGeometriaAnaliticaUsuario(operacionGeometriaAnalitica);
		HttpSession httpSession = request.getSession();
		httpSession.setAttribute("OBJETOGEOMETRIAANALITICA", objetoGeometriaAnalitica);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/formularioCalculadora3.jsp");
		dispatcher.forward(request, response);	
	}
	




}
