package opcionOperacionGeometriaEuclidianaUsuario;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AreaLongLadoApotemaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public AreaLongLadoApotemaServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String area = request.getParameter("area");
		String apotema = request.getParameter("apotema");
		String longLado = request.getParameter("longLado");
		AreaLongLadoApotema objetoAreaLongLadoApotema = new AreaLongLadoApotema(area, longLado, apotema);
		HttpSession httpSession = request.getSession();
		httpSession.setAttribute("OBJETOAREALONGLADOAPOTEMA", objetoAreaLongLadoApotema);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/resultadoNumLadosPolReg.jsp");
		dispatcher.forward(request, response);		
		
	}

}
