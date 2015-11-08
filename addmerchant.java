

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import qihang.DB;


/**
 * Servlet implementation class addmerchant
 */
@WebServlet("/addmerchant")
public class addmerchant extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addmerchant() {
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
		request.setCharacterEncoding("UTF-8");
		String name=request.getParameter("CompanyName");
		String age=request.getParameter("CompanyAge");
		String pass=request.getParameter("CompanyPwd");
		String tel=request.getParameter("CompanyTel");
		String time=request.getParameter("CompanyTime");
		String address=request.getParameter("CompanyAddress");
		merchant pern=new merchant();
		pern.setName(name);
		pern.setAge(age);
		pern.setPassword(pass); 
		pern.setTel(tel);
		pern.setTime(time);
		pern.setAddress(address);
		try { 
			this.insertmerchant(pern);
			response.sendRedirect("merchantinformation.jsp");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			response.sendRedirect("merchantregister.jsp");
		}		
	}
		

		public void insertmerchant(merchant pern) throws SQLException {
			// TODO Auto-generated method stub
				Connection conn=DB.getConnection();			 
				PreparedStatement stmt=conn.prepareStatement("insert into merchant(CompanyName,CompanyAge,CompanyPwd,CompanyTel,CompanyTime,CompanyAddress) values(?,?,?,?,?,?)");
				stmt.setString(1, pern.getName());
				stmt.setString(2, pern.getAge());
				stmt.setString(3, pern.getPassword());
				stmt.setString(4, pern.getTel()); 
				stmt.setString(5, pern.getTime());
				stmt.setString(6, pern.getAddress());
				stmt.executeUpdate();			
				stmt.close();
				conn.close();
		}
	}

