package tablaRendimientoAlumnos;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class OpcionEscogidaTablaRendAlumnosServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public OpcionEscogidaTablaRendAlumnosServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String opcionTablaRendAlumnos = request.getParameter("opcionTablaRendAlumnos");
		OpcionEscogidaTablaRendAlumnos objetoOpcionTablaRendAlumnos = new OpcionEscogidaTablaRendAlumnos(opcionTablaRendAlumnos);
		HttpSession httpSession = request.getSession();
		httpSession.setAttribute("OBJETOOPCIONTABLARENDALUMNOS", objetoOpcionTablaRendAlumnos);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/formularioTablaRendAlumnos.jsp");
		dispatcher.forward(request, response);

	}

}
