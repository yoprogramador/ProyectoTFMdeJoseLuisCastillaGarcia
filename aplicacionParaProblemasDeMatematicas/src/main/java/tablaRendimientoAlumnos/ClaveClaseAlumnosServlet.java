package tablaRendimientoAlumnos;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ClaveClaseAlumnosServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ClaveClaseAlumnosServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String claveClase = request.getParameter("claveClase");
		ClaveClaseAlumnos objetoClaseAlumnos = new ClaveClaseAlumnos(claveClase);
		HttpSession httpSession = request.getSession();
		httpSession.setAttribute("OBJETOCLASEALUMNOS", objetoClaseAlumnos);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/resultadoListaCasosPorClase.jsp");
		dispatcher.forward(request, response);				

	}

}
