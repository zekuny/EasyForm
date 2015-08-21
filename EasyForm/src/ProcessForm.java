

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ProcessForm
 */
@WebServlet("/ProcessForm")
public class ProcessForm extends HttpServlet {
	private static final long serialVersionUID = 1L;
    String table;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProcessForm() {
        super();
        table = "";
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String firstName = request.getParameter("firstname");
		String lastName = request.getParameter("lastname");
		String comment = request.getParameter("comment");
		String cars = request.getParameter("cars");
		String groupcars = request.getParameter("groupcars");
		table = "";
		table += "<form>"
		+ "<label>First Name</label>"
		+ "<input type=\"text\" value=\"" + firstName  + "\">"
		+ "<br>"
		+ "<label>Last Name</label>"
		+ "<input type=\"text\" value=\"" + lastName  + "\">"
		+ "<br>"
		+ "<label>comment</label>"
		+ "<input type=\"text\" value=\"" + comment  + "\">"
		+ "<br>"
		+ "<label>cars</label>"
		+ "<input type=\"text\" value=\"" + cars  + "\">"
		+ "<br>"
		+ "<label>groupcars</label>"
		+ "<input type=\"text\" value=\"" + groupcars  + "\">"
		+ "</form>";
		table += "<a href = \"https://www.youtube.com/\">Go somewhere interesting? Ok! Let's GO!!!</a>";
		request.setAttribute("table", table); 
		//request.setAttribute("extra", "<h1>extra</h1>"); 
		getServletContext().getRequestDispatcher("/output.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
