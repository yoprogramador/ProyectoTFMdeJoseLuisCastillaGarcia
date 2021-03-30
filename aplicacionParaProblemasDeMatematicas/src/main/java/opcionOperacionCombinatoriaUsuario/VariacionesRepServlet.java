package opcionOperacionCombinatoriaUsuario;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class VariacionesRepServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public VariacionesRepServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String n = request.getParameter("valorN");
		String r = request.getParameter("valorR");
		DosDatos objetoNyR = new DosDatos(n, r);
		HttpSession httpSession = request.getSession();
		httpSession.setAttribute("OBJETONYR", objetoNyR);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/resultadoVariacionesRep.jsp");
		dispatcher.forward(request, response);				

	}

}
