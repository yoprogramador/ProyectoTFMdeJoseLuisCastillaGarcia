package tablaRendimientoAlumnos;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ClaveTablaCasosServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ClaveTablaCasosServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String password = request.getParameter("password");
		ClaveTablaCasos objetoClave = new ClaveTablaCasos(password);
		HttpSession httpSession = request.getSession();
		httpSession.setAttribute("OBJETOCLAVE", objetoClave);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/formularioIntroduccionCaso.jsp");
		dispatcher.forward(request, response);				

	}

}
