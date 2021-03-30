package opcionOperacionGeometriaEuclidianaUsuario;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class DosDiagonalesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public DosDiagonalesServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String diagonalMayor = request.getParameter("diagonalMayor");
		String diagonalMenor = request.getParameter("diagonalMenor");
		DosDiagonales objetoDosDiagonales = new DosDiagonales(diagonalMayor, diagonalMenor);
		HttpSession httpSession = request.getSession();
		httpSession.setAttribute("OBJETODOSDIAGONALES", objetoDosDiagonales);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/resultadoAreaRombo.jsp");
		dispatcher.forward(request, response);		

	}

}
