package opcionOperacionGeometriaEuclidianaUsuario;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AreaNumLadosApotemaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public AreaNumLadosApotemaServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String area = request.getParameter("area");
		String apotema = request.getParameter("apotema");
		String numLados = request.getParameter("numLados");
		AreaNumLadosApotema objetoAreaNumLadosApotema = new AreaNumLadosApotema(area, numLados, apotema);
		HttpSession httpSession = request.getSession();
		httpSession.setAttribute("OBJETOAREANUMLADOSAPOTEMA", objetoAreaNumLadosApotema);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/resultadoLongLadoPolReg.jsp");
		dispatcher.forward(request, response);		
		
	}

}
