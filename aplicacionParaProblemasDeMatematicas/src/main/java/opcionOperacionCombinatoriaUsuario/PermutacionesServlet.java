package opcionOperacionCombinatoriaUsuario;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class PermutacionesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public PermutacionesServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String valorR = request.getParameter("valorR");
		UnDato objetoR = new UnDato(valorR);
		HttpSession httpSession = request.getSession();
		httpSession.setAttribute("OBJETOR", objetoR);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/resultadoPermutaciones.jsp");
		dispatcher.forward(request, response);				

	}

}
