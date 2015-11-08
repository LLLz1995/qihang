package qihang;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class StuInfo
 */
@WebServlet("/staff")
public class staff {
	private int EmployeeId;
	private String EmployeeName;
    private String EmployeePwd;
    private String EmployeeSex;
    private String EmployeeAge;
    private String EmployeeEducation;
    private String EmployeeTel;
    private String EmployeeDep;
    private String EmployeePosition;

    public int getId() {
		return EmployeeId;
	}
	public void setId(int EmployeeId) {
		this.EmployeeId = EmployeeId;
	}
	public String getName() {
		return EmployeeName;
	}
	public void setName(String EmployeeName) {
		this.EmployeeName = EmployeeName;
	}
	
	public String getPassword() {
		return EmployeePwd;
	}
	public void setPassword(String EmployeePwd) {
		this.EmployeePwd = EmployeePwd;
	}
	public String getSex() {
		return EmployeeSex;
	}
	public void setSex(String EmployeeSex) {
		this.EmployeeSex = EmployeeSex;
	}
	public String getAge() {
		return EmployeeAge;
	}
	public void setAge(String EmployeeAge) {
		this.EmployeeAge = EmployeeAge;
	}
	public String getEducation() {
		return EmployeeEducation;
	}
	public void setEducation(String EmployeeEducation) {
		this.EmployeeEducation = EmployeeEducation;
	}

	public String getTel() {
		return EmployeeTel;
	}
	public void setTel(String EmployeeTel) {
		this.EmployeeTel = EmployeeTel;
	}
	public String getDep() {
		return EmployeeDep;
	}
	public void setDep(String EmployeeDep) {
		this.EmployeeDep = EmployeeDep;
	}
	public String getPosition() {
		return EmployeePosition;
	}
	public void setPosition(String EmployeePosition) {
		this.EmployeePosition = EmployeePosition;
	}
	 
	
       
    
   

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
