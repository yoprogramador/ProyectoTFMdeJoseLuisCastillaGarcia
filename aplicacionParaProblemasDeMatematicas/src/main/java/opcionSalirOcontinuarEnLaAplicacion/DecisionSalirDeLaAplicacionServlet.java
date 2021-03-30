package opcionSalirOcontinuarEnLaAplicacion;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class DecisionSalirDeLaAplicacionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public DecisionSalirDeLaAplicacionServlet() {
        super();

    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String decisionSalirOno = request.getParameter("decisionSalirOno");
		DecisionSalirDeLaAplicacion objetoSalirOnoSalir = new DecisionSalirDeLaAplicacion(decisionSalirOno);
		HttpSession httpSession = request.getSession();
		httpSession.setAttribute("OBJETOSALIRONOSALIR", objetoSalirOnoSalir);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/decisionSalirOnoAplicacion.jsp");
		dispatcher.forward(request, response);
	}
	

}
