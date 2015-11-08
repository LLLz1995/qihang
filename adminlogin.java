
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.SQLException;
import javax.servlet.http.HttpSession;
/**
 * Servlet implementation class login
 */
@WebServlet("/adminlogin")
public class adminlogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public adminlogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		String name=request.getParameter("EmployeeName");
		String pass=request.getParameter("EmployeePwd");
		HttpSession session=request.getSession();
		session.setAttribute("EmployeeName", name);
		admin n=new admin();
		String pwd="";
		try {
			 pwd=n.selectadmin(name)	;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if ( pass.equals(pwd)&& pass!=null) {
			//login successfully
			HttpSession hs = request.getSession();
			hs.setAttribute("EmployeeName", name);			
			hs.setAttribute("logined", true);
			
			
			//转向登陆成功页面
			response.sendRedirect("background.jsp");
			
		}
		else {
			response.sendRedirect("adminlogin.jsp");
		}	
	}

}
