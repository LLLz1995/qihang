


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
import qihang.staff;


/**
 * Servlet implementation class addstaff
 */
@WebServlet("/addstaff")
public class addstaff extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addstaff() {
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
		String name=request.getParameter("EmployeeName");
		String pass=request.getParameter("EmployeePwd");
		String sex=request.getParameter("EmployeeSex");
		String age=request.getParameter("EmployeeAge");
		String edu=request.getParameter("EmployeeEducation");
		String tel=request.getParameter("EmployeeTel");
		String dep=request.getParameter("EmployeeDep");
		String pos=request.getParameter("EmployeePosition");
		staff pern=new staff();
		pern.setName(name);
		pern.setPassword(pass); 
		pern.setSex(sex);
		pern.setAge(age);
		pern.setEducation(edu);
		pern.setTel(tel);
		pern.setDep(dep);
		pern.setPosition(pos);
		try {
			this.insertstaff(pern);
			response.sendRedirect("staffinformation.jsp");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			response.sendRedirect("staffregister.jsp");
		}		
	}
		

		public void insertstaff(staff pern) throws SQLException {
			// TODO Auto-generated method stub
				Connection conn=DB.getConnection();			 
				PreparedStatement stmt=conn.prepareStatement("insert into staff(EmployeeName,EmployeePwd,EmployeeSex,EmployeeAge,EmployeeEducation,EmployeeTel,EmployeeDep,EmployeePosition) values(?,?,?,?,?,?,?,?)");
				stmt.setString(1, pern.getName());
				stmt.setString(2, pern.getPassword());
				stmt.setString(3, pern.getSex()); 
				stmt.setString(4, pern.getAge());
				stmt.setString(5, pern.getEducation());
				stmt.setString(6, pern.getTel());
				stmt.setString(7, pern.getDep());
				stmt.setString(8, pern.getPosition());
				stmt.executeUpdate();			
				stmt.close();
				conn.close();
		}
	}
