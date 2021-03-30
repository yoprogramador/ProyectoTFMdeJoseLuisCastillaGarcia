package opcionOperacionGeometriaEuclidianaUsuario;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class NumLadosLongLadoApotemaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public NumLadosLongLadoApotemaServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String numLados = request.getParameter("numLados");
		String longLado = request.getParameter("longLado");
		String apotema = request.getParameter("apotema");
		NumLadosLongLadoApotema objetoNumLadosLongLadoApotema = new NumLadosLongLadoApotema(numLados, longLado, apotema);
		HttpSession httpSession = request.getSession();
		httpSession.setAttribute("OBJETONUMLADOSLONGLADOAPOTEMA", objetoNumLadosLongLadoApotema);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/resultadoAreaPolReg.jsp");
		dispatcher.forward(request, response);		
		
	}

}
