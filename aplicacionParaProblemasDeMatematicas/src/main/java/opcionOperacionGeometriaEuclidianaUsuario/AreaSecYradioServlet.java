package opcionOperacionGeometriaEuclidianaUsuario;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AreaSecYradioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public AreaSecYradioServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String areaSec = request.getParameter("areaSec");
		String radio = request.getParameter("radio");
		AreaSecYradio objetoAreaSecYradio = new AreaSecYradio(areaSec, radio);
		HttpSession httpSession = request.getSession();
		httpSession.setAttribute("OBJETOAREASECYRADIO", objetoAreaSecYradio);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/resultadoGradosSectorCir.jsp");
		dispatcher.forward(request, response);		

	}

}
