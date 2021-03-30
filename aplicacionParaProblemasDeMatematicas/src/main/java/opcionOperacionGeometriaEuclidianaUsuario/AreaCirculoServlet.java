package opcionOperacionGeometriaEuclidianaUsuario;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AreaCirculoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public AreaCirculoServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String area = request.getParameter("area");
		AreaCirculo objetoArea = new AreaCirculo(area);
		HttpSession httpSession = request.getSession();
		httpSession.setAttribute("OBJETOAREA", objetoArea);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/resultadoRadioCirculo.jsp");
		dispatcher.forward(request, response);				

	}

}
