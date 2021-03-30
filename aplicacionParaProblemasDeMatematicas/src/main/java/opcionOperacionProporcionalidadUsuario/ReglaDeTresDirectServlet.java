package opcionOperacionProporcionalidadUsuario;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class ReglaDeTresDirectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public ReglaDeTresDirectServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String primeraCantidadVariableA = request.getParameter("primeraCantidadVariableA");
		String primeraCantidadVariableB = request.getParameter("primeraCantidadVariableB");
		String segundaCantidadVariableA = request.getParameter("segundaCantidadVariableA");
		ReglaDeTres objetoReglaDeTres = new ReglaDeTres(primeraCantidadVariableA, primeraCantidadVariableB, segundaCantidadVariableA);
		HttpSession httpSession = request.getSession();
		httpSession.setAttribute("OBJETOREGLADETRES", objetoReglaDeTres);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/resultadoReglaDe3Dir.jsp");
		dispatcher.forward(request, response);
		
	}

}
