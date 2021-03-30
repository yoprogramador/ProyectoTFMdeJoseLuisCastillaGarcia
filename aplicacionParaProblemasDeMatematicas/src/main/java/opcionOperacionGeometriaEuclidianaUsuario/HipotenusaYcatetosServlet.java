package opcionOperacionGeometriaEuclidianaUsuario;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class HipotenusaYcatetosServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public HipotenusaYcatetosServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String hipotenusa = request.getParameter("hipotenusa");
		String cateto1 = request.getParameter("cateto1");
		String cateto2 = request.getParameter("cateto2");
		HipotenusaYcatetos objetoHipotenusaYcatetos = new HipotenusaYcatetos(hipotenusa, cateto1, cateto2);
		HttpSession httpSession = request.getSession();
		httpSession.setAttribute("OBJETOHIPOTENUSAYCATETOS", objetoHipotenusaYcatetos);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/resultadoAlturaTrianguloRect.jsp");
		dispatcher.forward(request, response);		

	}

}
