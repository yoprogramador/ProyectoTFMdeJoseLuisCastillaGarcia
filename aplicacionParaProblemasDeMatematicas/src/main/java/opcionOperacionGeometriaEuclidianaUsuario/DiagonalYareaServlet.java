package opcionOperacionGeometriaEuclidianaUsuario;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class DiagonalYareaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public DiagonalYareaServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String diagonalConocida = request.getParameter("diagonalConocida");
		String area = request.getParameter("area");
		DiagonalYarea objetoDiagonalYarea = new DiagonalYarea(diagonalConocida, area);
		HttpSession httpSession = request.getSession();
		httpSession.setAttribute("OBJETODIAGONALYAREA", objetoDiagonalYarea);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/resultadoDiagonalRombo.jsp");
		dispatcher.forward(request, response);		
		
	}

}
