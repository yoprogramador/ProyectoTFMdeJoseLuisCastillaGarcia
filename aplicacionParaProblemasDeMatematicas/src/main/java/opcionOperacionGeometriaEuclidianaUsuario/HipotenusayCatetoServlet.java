package opcionOperacionGeometriaEuclidianaUsuario;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class HipotenusayCatetoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public HipotenusayCatetoServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String hipotenusa = request.getParameter("hipotenusa");
		String cateto = request.getParameter("cateto");
		HipotenusayCateto objetoHipotenusayCateto = new HipotenusayCateto(hipotenusa, cateto);
		HttpSession httpSession = request.getSession();
		httpSession.setAttribute("OBJETOHIPOTENUSAYCATETO", objetoHipotenusayCateto);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/resultadoLongitudCateto.jsp");
		dispatcher.forward(request, response);
		
	}

}
