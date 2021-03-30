package tablaRendimientoAlumnos;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class FormularioAlumnoProblemaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public FormularioAlumnoProblemaServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nombreApellidos = request.getParameter("nombreApellidos");
		String claseAlumno = request.getParameter("claseAlumno");
		String identificadorProblema = request.getParameter("identificadorProblema");
		String exitoResolucion = request.getParameter("exitoResolucion");
		String tiempoInvertido = request.getParameter("tiempoInvertido");
		RendimientoAlumnosDAO objetoCaso = new RendimientoAlumnosDAO(nombreApellidos, claseAlumno, identificadorProblema, exitoResolucion, tiempoInvertido);
		HttpSession httpSession = request.getSession();
		httpSession.setAttribute("OBJETOCASO", objetoCaso);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/resultadoInsertCaso.jsp");
		dispatcher.forward(request, response);
		
	}

}
