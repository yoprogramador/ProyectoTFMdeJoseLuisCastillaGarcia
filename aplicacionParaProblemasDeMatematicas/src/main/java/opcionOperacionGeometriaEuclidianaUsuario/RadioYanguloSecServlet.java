package opcionOperacionGeometriaEuclidianaUsuario;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class RadioYanguloSecServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public RadioYanguloSecServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String radio = request.getParameter("radio");
		String anguloSec = request.getParameter("anguloSec");
		RadioYanguloSec objetoRadioYanguloSec = new RadioYanguloSec(radio, anguloSec);
		HttpSession httpSession = request.getSession();
		httpSession.setAttribute("OBJETORADIOYANGULOSEC", objetoRadioYanguloSec);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/resultadoAreaSector.jsp");
		dispatcher.forward(request, response);		
		
	}

}
