package opcionOperacionTrigonometriaUsuario;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class CatetoAngulosServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public CatetoAngulosServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String hipotenusa = request.getParameter("hipotenusa");		
		String catetoConocido = request.getParameter("catetoConocido");
		DosDatos objetoDosDatos = new DosDatos(hipotenusa, catetoConocido);
		HttpSession httpSession = request.getSession();
		httpSession.setAttribute("OBJETODOSDATOS", objetoDosDatos);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/resultadoCatetoAngulos.jsp");
		dispatcher.forward(request, response);

	}

}
