package opcionOperacionGeometriaEuclidianaUsuario;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AreaNumLadosLongLadoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public AreaNumLadosLongLadoServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String area = request.getParameter("area");
		String longLado = request.getParameter("longLado");
		String numLados = request.getParameter("numLados");
		AreaNumLadosLongLado objetoAreaNumLadosLongLado = new AreaNumLadosLongLado(area, longLado, numLados);
		HttpSession httpSession = request.getSession();
		httpSession.setAttribute("OBJETOAREANUMLADOSLONGLADO", objetoAreaNumLadosLongLado);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/resultadoApotemaPolReg.jsp");
		dispatcher.forward(request, response);		
		
	}

}
