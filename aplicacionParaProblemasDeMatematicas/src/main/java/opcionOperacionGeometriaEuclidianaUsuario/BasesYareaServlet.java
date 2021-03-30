package opcionOperacionGeometriaEuclidianaUsuario;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class BasesYareaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public BasesYareaServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String baseInferior = request.getParameter("baseInferior");
		String baseSuperior = request.getParameter("baseSuperior");
		String area = request.getParameter("area");
		BasesYarea objetoBasesYarea = new BasesYarea(baseInferior, baseSuperior, area);
		HttpSession httpSession = request.getSession();
		httpSession.setAttribute("OBJETOBASESYAREA", objetoBasesYarea);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/resultadoAlturaTrapecio.jsp");
		dispatcher.forward(request, response);		

	}

}
