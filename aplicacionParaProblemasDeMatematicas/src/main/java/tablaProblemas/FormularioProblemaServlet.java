package tablaProblemas;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class FormularioProblemaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public FormularioProblemaServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String enunciadoDelProblema = request.getParameter("enunciadoDelProblema");
		String areaDelProblema = request.getParameter("areaDelProblema");
		String procedimientoResolucion = request.getParameter("procedimientoResolucion");
		String solucionProblema = request.getParameter("solucionProblema");
		String porcentajeDeResolucion = request.getParameter("porcentajeDeResolucion");
		String tiempoMedioMinutosInvertidoEnProblema = request.getParameter("tiempoMedioMinutosInvertidoEnProblema");
		ProblemasDao objetoProblema = new ProblemasDao(enunciadoDelProblema, areaDelProblema, procedimientoResolucion, solucionProblema, porcentajeDeResolucion, tiempoMedioMinutosInvertidoEnProblema);
		HttpSession httpSession = request.getSession();
		httpSession.setAttribute("OBJETOPROBLEMA", objetoProblema);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/resultadoInsertProblema.jsp");
		dispatcher.forward(request, response);
		
	}

}
