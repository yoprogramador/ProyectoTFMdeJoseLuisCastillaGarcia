package tablaProblemas;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ClaveTablaProblemas3Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ClaveTablaProblemas3Servlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String password = request.getParameter("password");
		ClaveTablaProblemas objetoClave = new ClaveTablaProblemas(password);
		HttpSession httpSession = request.getSession();
		httpSession.setAttribute("OBJETOCLAVE", objetoClave);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/formularioEliminarProblema.jsp");
		dispatcher.forward(request, response);				
		
	}

}
