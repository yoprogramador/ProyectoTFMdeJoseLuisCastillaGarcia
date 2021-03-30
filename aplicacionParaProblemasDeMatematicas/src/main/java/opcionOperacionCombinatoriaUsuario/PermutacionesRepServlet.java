package opcionOperacionCombinatoriaUsuario;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class PermutacionesRepServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public PermutacionesRepServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String valoresR = request.getParameter("valoresR");
		UnDato objetoRs = new UnDato(valoresR);
		HttpSession httpSession = request.getSession();
		httpSession.setAttribute("OBJETORS", objetoRs);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/resultadoPermutacionesRep.jsp");
		dispatcher.forward(request, response);				

	}

}
