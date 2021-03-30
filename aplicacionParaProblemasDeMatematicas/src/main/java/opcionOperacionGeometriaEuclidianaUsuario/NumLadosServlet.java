package opcionOperacionGeometriaEuclidianaUsuario;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class NumLadosServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public NumLadosServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String numeroLados = request.getParameter("numeroLados");
		NumeroLados objetoNumLados = new NumeroLados(numeroLados);
		HttpSession httpSession = request.getSession();
		httpSession.setAttribute("OBJETONUMLADOS", objetoNumLados);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/resultadoNumeroDiagonales.jsp");
		dispatcher.forward(request, response);				

	}

}
