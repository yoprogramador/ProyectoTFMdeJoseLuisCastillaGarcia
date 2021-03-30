package opcionOperacionGeometriaEuclidianaUsuario;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class GradosServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public GradosServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String grados = request.getParameter("grados");
		Grados objetoGrados = new Grados(grados);
		HttpSession httpSession = request.getSession();
		httpSession.setAttribute("OBJETOGRADOS", objetoGrados);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/resultadoGradosAradianes.jsp");
		dispatcher.forward(request, response);				
		
	}

}
