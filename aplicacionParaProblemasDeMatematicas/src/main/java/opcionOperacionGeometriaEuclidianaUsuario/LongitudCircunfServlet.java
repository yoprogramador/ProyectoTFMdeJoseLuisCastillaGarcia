package opcionOperacionGeometriaEuclidianaUsuario;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LongitudCircunfServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LongitudCircunfServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String circunferencia = request.getParameter("circunferencia");
		LongitudCircunf objetoLongCircunf = new LongitudCircunf(circunferencia);
		HttpSession httpSession = request.getSession();
		httpSession.setAttribute("OBJETOLONGCIRCUNF", objetoLongCircunf);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/resultadoLongitudRad.jsp");
		dispatcher.forward(request, response);				
		
	}

}
