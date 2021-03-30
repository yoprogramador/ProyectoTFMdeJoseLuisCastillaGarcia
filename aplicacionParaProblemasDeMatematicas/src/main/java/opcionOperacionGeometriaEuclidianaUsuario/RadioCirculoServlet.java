package opcionOperacionGeometriaEuclidianaUsuario;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class RadioCirculoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public RadioCirculoServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String radio = request.getParameter("radio");
		RadioCirculo objetoRadio = new RadioCirculo(radio);
		HttpSession httpSession = request.getSession();
		httpSession.setAttribute("OBJETORADIO", objetoRadio);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/resultadoAreaCirculo.jsp");
		dispatcher.forward(request, response);				

	}

}
