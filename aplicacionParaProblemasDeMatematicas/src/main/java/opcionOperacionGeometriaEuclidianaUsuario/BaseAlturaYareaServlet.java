package opcionOperacionGeometriaEuclidianaUsuario;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class BaseAlturaYareaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public BaseAlturaYareaServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String baseConocida = request.getParameter("baseConocida");
		String altura = request.getParameter("altura");
		String area = request.getParameter("area");
		BaseAlturaYarea objetoBaseAlturaYarea = new BaseAlturaYarea(baseConocida, altura, area);
		HttpSession httpSession = request.getSession();
		httpSession.setAttribute("OBJETOBASEALTURAYAREA", objetoBaseAlturaYarea);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/resultadoBaseTrapecio.jsp");
		dispatcher.forward(request, response);		

	}

}
