
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import qihang.DB;
import qihang.staff;


public class admin {
	public void insertadmin(staff pern) throws SQLException{
		 Connection conn=DB.getConnection();

		 PreparedStatement stmt=conn.prepareStatement("insert into Staff (EmployeeName,EmployeePwd,EmployeeSex,EmployeeAge,EmployeeEducation,EmployeeTel,EmployeeDep,EmployeePosition) values(?,?,?)");
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


	//查找密码
	public String selectadmin(String EmployeeName) throws SQLException{		
			Connection conn=DB.getConnection();
			StringBuilder yh=new StringBuilder();
			yh.append("select * from Staff where EmployeeName=? ");
			PreparedStatement stm=conn.prepareStatement(yh.toString());
			stm.setString(1, EmployeeName);
			ResultSet rs=stm.executeQuery();
			String pwd="";
			while(rs.next()){				
				 pwd=rs.getString("EmployeePwd");				
			}
			return pwd;
		
	}
}

