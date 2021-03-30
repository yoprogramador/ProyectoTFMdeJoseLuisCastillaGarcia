package opcionOperacionGeometriaEuclidianaUsuario;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AlturaYcatetosServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public AlturaYcatetosServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String altura = request.getParameter("altura");
		String cateto1 = request.getParameter("cateto1");
		String cateto2 = request.getParameter("cateto2");
		AlturaYcatetos objetoAlturaYcatetos = new AlturaYcatetos(altura, cateto1, cateto2);
		HttpSession httpSession = request.getSession();
		httpSession.setAttribute("OBJETOALTURAYCATETOS", objetoAlturaYcatetos);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/resultadoHipotenusaTrianguloRect.jsp");
		dispatcher.forward(request, response);		

	}

}
