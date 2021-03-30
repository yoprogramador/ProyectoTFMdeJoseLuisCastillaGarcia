package opcionOperacionGeometriaEuclidianaUsuario;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class BaseYareaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public BaseYareaServlet() {
        super();
    }

protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String base = request.getParameter("base");
	String area = request.getParameter("area");
	BaseYarea objetoBaseYarea = new BaseYarea(base, area);
	HttpSession httpSession = request.getSession();
	httpSession.setAttribute("OBJETOBASEYAREA", objetoBaseYarea);
	RequestDispatcher dispatcher = request.getRequestDispatcher("/resultadoAlturaParalelog.jsp");
	dispatcher.forward(request, response);		

	}

}
