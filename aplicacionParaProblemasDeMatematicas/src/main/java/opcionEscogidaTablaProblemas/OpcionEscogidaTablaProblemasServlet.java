package opcionEscogidaTablaProblemas;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



public class OpcionEscogidaTablaProblemasServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public OpcionEscogidaTablaProblemasServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String opcionTablaProblemas = request.getParameter("opcionTablaProblemas");
		OpcionEscogidaTablaProblemas objetoTablaProblemas = new OpcionEscogidaTablaProblemas(opcionTablaProblemas);
		HttpSession httpSession = request.getSession();
		httpSession.setAttribute("OBJETOTABLAPROBLEMAS", objetoTablaProblemas);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/formularioTablaProblemas.jsp");
		dispatcher.forward(request, response);
	}



}
