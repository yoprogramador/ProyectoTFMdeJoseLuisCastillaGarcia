package opcionOperacionGeometriaEuclidianaUsuario;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AreaYanguloSecServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public AreaYanguloSecServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String areaSec = request.getParameter("areaSec");
		String anguloSec = request.getParameter("anguloSec");
		AreaYanguloSec objetoAreaYanguloSec = new AreaYanguloSec(areaSec, anguloSec);
		HttpSession httpSession = request.getSession();
		httpSession.setAttribute("OBJETOAREAYANGULOSEC", objetoAreaYanguloSec);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/resultadoRadioSC.jsp");
		dispatcher.forward(request, response);		

	}

}
