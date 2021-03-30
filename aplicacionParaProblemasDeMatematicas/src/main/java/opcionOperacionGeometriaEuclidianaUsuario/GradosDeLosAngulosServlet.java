package opcionOperacionGeometriaEuclidianaUsuario;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class GradosDeLosAngulosServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public GradosDeLosAngulosServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String gradosDeLosAngulos = request.getParameter("gradosDeLosAngulos");
		GradosDeLosAngulos objetoGradAng = new GradosDeLosAngulos(gradosDeLosAngulos);
		HttpSession httpSession = request.getSession();
		httpSession.setAttribute("OBJETOGRADANG", objetoGradAng);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/resultadoNumeroDeLadosPoligono.jsp");
		dispatcher.forward(request, response);				

	}

}
