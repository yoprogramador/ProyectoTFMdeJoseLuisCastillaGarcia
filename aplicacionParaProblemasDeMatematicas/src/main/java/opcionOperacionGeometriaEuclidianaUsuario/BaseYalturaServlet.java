package opcionOperacionGeometriaEuclidianaUsuario;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class BaseYalturaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public BaseYalturaServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String base = request.getParameter("base");
		String altura = request.getParameter("altura");
		BaseYaltura objetoBaseYaltura = new BaseYaltura(base, altura);
		HttpSession httpSession = request.getSession();
		httpSession.setAttribute("OBJETOBASEYALTURA", objetoBaseYaltura);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/resultadoAreaParalelog.jsp");
		dispatcher.forward(request, response);		

	}

}
