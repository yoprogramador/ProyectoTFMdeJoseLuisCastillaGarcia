package opcionOperacionGeometriaEuclidianaUsuario;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LongitudCircunferenciaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    public LongitudCircunferenciaServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String radio = request.getParameter("radio");
		LongitudRadioCircunferencia objetoRadio = new LongitudRadioCircunferencia(radio);
		HttpSession httpSession = request.getSession();
		httpSession.setAttribute("OBJETORADIO", objetoRadio);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/resultadoLongitudCircunferencia.jsp");
		dispatcher.forward(request, response);				
		
	}

}
