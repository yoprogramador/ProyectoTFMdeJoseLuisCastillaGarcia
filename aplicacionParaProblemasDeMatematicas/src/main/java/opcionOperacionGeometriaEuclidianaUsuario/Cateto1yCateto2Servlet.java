package opcionOperacionGeometriaEuclidianaUsuario;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Cateto1yCateto2Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Cateto1yCateto2Servlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String cateto1 = request.getParameter("cateto1");
		String cateto2 = request.getParameter("cateto2");
		Cateto1yCateto2 objetoCateto1yCateto2 = new Cateto1yCateto2(cateto1, cateto2);
		HttpSession httpSession = request.getSession();
		httpSession.setAttribute("OBJETOCATETO1YCATETO2", objetoCateto1yCateto2);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/resultadoLongitudHipotenusa.jsp");
		dispatcher.forward(request, response);
		
	}

}
