package opcionOperacionGeometriaEuclidianaUsuario;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class BasesYalturaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    public BasesYalturaServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String baseInferior = request.getParameter("baseInferior");
		String baseSuperior = request.getParameter("baseSuperior");
		String altura = request.getParameter("altura");
		BasesYaltura objetoBasesYaltura = new BasesYaltura(baseInferior, baseSuperior, altura);
		HttpSession httpSession = request.getSession();
		httpSession.setAttribute("OBJETOBASESYALTURA", objetoBasesYaltura);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/resultadoAreaTrapecio.jsp");
		dispatcher.forward(request, response);		

	}

}
