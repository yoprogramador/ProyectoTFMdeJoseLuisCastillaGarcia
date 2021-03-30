package opcionOperacionGeometriaEuclidianaUsuario;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class RadianesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public RadianesServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String radianes = request.getParameter("radianes");
		Radianes objetoRadianes = new Radianes(radianes);
		HttpSession httpSession = request.getSession();
		httpSession.setAttribute("OBJETORADIANES", objetoRadianes);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/resultadoRadianesAgrados.jsp");
		dispatcher.forward(request, response);				
		
	}

}
