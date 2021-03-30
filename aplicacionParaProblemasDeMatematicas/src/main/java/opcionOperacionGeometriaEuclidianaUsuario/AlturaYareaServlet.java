package opcionOperacionGeometriaEuclidianaUsuario;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AlturaYareaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public AlturaYareaServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String altura = request.getParameter("altura");
		String area = request.getParameter("area");
		AlturaYarea objetoAlturaYarea = new AlturaYarea(altura, area);
		HttpSession httpSession = request.getSession();
		httpSession.setAttribute("OBJETOALTURAYAREA", objetoAlturaYarea);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/resultadoBaseParalelog.jsp");
		dispatcher.forward(request, response);		

	}

}
