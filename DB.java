package qihang;


import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DB
 */
@WebServlet("/DB")
public class DB extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DB() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Connection conn=null;
		 
		try {
			Class.forName("org.mariadb.jdbc.Driver");
		
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			conn = DriverManager.getConnection(
					"jdbc:mariadb://localhost:3306/QiHang", "root", "123456");
			System.out.println("连接成功"); 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("连接失败");
		}finally{ 
			if(conn!=null){
				try {
					conn.close(); 
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
		

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	public static Connection getConnection(){
		String userName="root";
		String password="123456";
		String driver="org.mariadb.jdbc.Driver";
		String url="jdbc:mariadb://localhost:3306/QiHang";
		Connection conn=null;
		try{
			Class.forName(driver);
			conn=DriverManager.getConnection(url,userName,password);			
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("连接失败");
		}
		return conn;		
	}
}
