package opcionOperacionTrigonometriaUsuario;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AngulosHipotenusaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public AngulosHipotenusaServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String catetoConocido1 = request.getParameter("catetoConocido1");		
		String catetoConocido2 = request.getParameter("catetoConocido2");
		DosDatos objetoDosDatos = new DosDatos(catetoConocido1, catetoConocido2);
		HttpSession httpSession = request.getSession();
		httpSession.setAttribute("OBJETODOSDATOS", objetoDosDatos);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/resultadoAngulosHipotenusa.jsp");
		dispatcher.forward(request, response);

	}

}
