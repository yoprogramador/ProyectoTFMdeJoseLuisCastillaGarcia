package opcionOperacionTrigonometriaUsuario;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SenoCosenoTangenteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public SenoCosenoTangenteServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String hipotenusa = request.getParameter("hipotenusa");
		String catetoOpuesto = request.getParameter("catetoOpuesto");
		String catetoContiguo = request.getParameter("catetoContiguo");
		TresDatos objetoTresDatos = new TresDatos(hipotenusa, catetoOpuesto, catetoContiguo);
		HttpSession httpSession = request.getSession();
		httpSession.setAttribute("OBJETOTRESDATOS", objetoTresDatos);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/resultadoSenoCosenoTangente.jsp");
		dispatcher.forward(request, response);		

	}

}
