package opcionOperacionGeometriaEuclidianaUsuario;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AlturaHipotenusaYcatetoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public AlturaHipotenusaYcatetoServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String altura = request.getParameter("altura");
		String hipotenusa = request.getParameter("hipotenusa");
		String cateto = request.getParameter("cateto");
		AlturaHipotenusaYcateto objetoAlturaHipotenusaYcateto = new AlturaHipotenusaYcateto(altura, hipotenusa, cateto);
		HttpSession httpSession = request.getSession();
		httpSession.setAttribute("OBJETOALTURAHIPOTENUSAYCATETO", objetoAlturaHipotenusaYcateto);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/resultadoCatetoTrianguloRect.jsp");
		dispatcher.forward(request, response);		
		
	}

}
