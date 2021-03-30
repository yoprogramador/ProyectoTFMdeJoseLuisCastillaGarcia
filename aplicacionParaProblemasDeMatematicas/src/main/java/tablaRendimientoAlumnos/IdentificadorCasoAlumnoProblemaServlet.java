package tablaRendimientoAlumnos;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class IdentificadorCasoAlumnoProblemaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public IdentificadorCasoAlumnoProblemaServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String identificadorDelCaso = request.getParameter("identificadorDelCaso");
		IdentificadorCasoAlumnoProblema objetoIdentificadorCaso = new IdentificadorCasoAlumnoProblema(identificadorDelCaso);
		HttpSession httpSession = request.getSession();
		httpSession.setAttribute("OBJETOIDENTIFICADOR", objetoIdentificadorCaso);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/resultadoCasoPorId.jsp");
		dispatcher.forward(request, response);

	}

}
