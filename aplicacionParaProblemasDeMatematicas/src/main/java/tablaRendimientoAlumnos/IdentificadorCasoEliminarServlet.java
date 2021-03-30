package tablaRendimientoAlumnos;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class IdentificadorCasoEliminarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public IdentificadorCasoEliminarServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String identificador = request.getParameter("identificadorDelCaso");
		IdentificadorCasoAlumnoProblema objetoIdentificador = new IdentificadorCasoAlumnoProblema(identificador);
		HttpSession httpSession = request.getSession();
		httpSession.setAttribute("OBJETOIDENTIFICADOR", objetoIdentificador);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/resultadoEliminarCasoPorId.jsp");
		dispatcher.forward(request, response);

	}

}
