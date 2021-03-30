package opcionOperacionGeometriaEuclidianaUsuario;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class OperacionGeometriaEuclidianaUsuarioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public OperacionGeometriaEuclidianaUsuarioServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String operacionGeometriaEuclidiana = request.getParameter("operacionGeometriaEuclidiana");
		OperacionGeometriaEuclidianaUsuario objetoGeometriaEuclidiana  = new OperacionGeometriaEuclidianaUsuario(operacionGeometriaEuclidiana);
		HttpSession httpSession = request.getSession();
		httpSession.setAttribute("OBJETOGEOMETRIAEUCLIDIANA", objetoGeometriaEuclidiana);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/formularioCalculadora5.jsp");
		dispatcher.forward(request, response);	
		
	}

}
