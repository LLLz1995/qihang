
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class StuInfo
 */
@WebServlet("/merchant")
public class merchant { 
	private int CompanyID;
	private String CompanyName;
    private String CompanyAge;
    private String CompanyPwd;
    private String CompanyTel;
    private String CompanyTime;
    private String CompanyAddress;

    public int getId() {
		return CompanyID;
	}
	public void setId(int CompanyID) {
		this.CompanyID = CompanyID;
	}
	public String getName() {
		return CompanyName;
	}
	public void setName(String CompanyName) {
		this.CompanyName = CompanyName;
	}
	
	public String getPassword() {
		return CompanyPwd;
	}
	public void setPassword(String CompanyPwd) {
		this.CompanyPwd = CompanyPwd;
	}
	public String getAge() {
		return CompanyAge;
	}
	public void setAge(String CompanyAge) {
		this.CompanyAge = CompanyAge;
	}
	public String getTel() {
		return CompanyTel;
	}
	public void setTel(String CompanyTel) {
		this.CompanyTel = CompanyTel;
	}
	public String getTime() {
		return CompanyTime;
	}
	public void setTime(String CompanyTime) {
		this.CompanyTime = CompanyTime;
	}
	public String getAddress() {
		return CompanyAddress;
	}
	public void setAddress(String CompanyAddress) {
		this.CompanyAddress = CompanyAddress;
	}
	 
	
       
    
   

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
