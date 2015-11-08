package qihang;


import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class staffsize
 */
@WebServlet("/staffsize")
public class staffsize extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public staffsize() {
        super();
        // TODO Auto-generated constructor stub
    }
    public static List<staff> getSelect(){
		  List list = new ArrayList<staff>();
		  Connection con = null;
		  PreparedStatement ps = null;
		  ResultSet rs = null;
		  try{
		   String sql = "select * from staff";
		   con = DB.getConnection();
		   ps = con.prepareStatement(sql);
		   rs = ps.executeQuery();
		   while(rs.next()){
			staff staff = new staff();
			staff.setId(rs.getInt(1));
			staff.setName(rs.getString(2));
			staff.setPassword(rs.getString(3));
			staff.setSex(rs.getString(4));
			staff.setAge(rs.getString(5));
			staff.setEducation(rs.getString(6));
			staff.setTel(rs.getString(7));
			staff.setDep(rs.getString(8));
			staff.setPosition(rs.getString(9));
		    list.add(staff);
		   }
		  }catch(Exception e){
		   e.printStackTrace();
		  }
		  return list;
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
	}

}
