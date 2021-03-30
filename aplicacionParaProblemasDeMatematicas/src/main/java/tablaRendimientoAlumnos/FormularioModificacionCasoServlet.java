package tablaRendimientoAlumnos;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import tablaProblemas.FormularioToUpdate;

public class FormularioModificacionCasoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public FormularioModificacionCasoServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String identificador = request.getParameter("identificador");
		String campo = request.getParameter("campo");
		String datos = request.getParameter("datos");
		FormularioToUpdate objetoFormToUpdate = new FormularioToUpdate(identificador, campo, datos);
		HttpSession httpSession = request.getSession();
		httpSession.setAttribute("OBJETOFORMTOUPDATE", objetoFormToUpdate);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/resultadoModificacionCaso.jsp");
		dispatcher.forward(request, response);

	}

}
