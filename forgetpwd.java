

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import qihang.DB;
/**
 * Servlet implementation class forgetpwd
 */
@WebServlet("/forgetpwd")
public class forgetpwd extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public forgetpwd() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		Connection conn=DB.getConnection();
		String name=request.getParameter("EmployeeName");
		String mailaddress=request.getParameter("Email");
		String pwd="";
		try {
			PreparedStatement stmt=conn.prepareStatement("select * from staff where EmployeeName='"+name+"' ");
	        ResultSet rs=stmt.executeQuery();	   
	    while(rs.next()){
	    	pwd=rs.getString("EmployeePwd");
	    }	   
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}	
		final String username1 = "cumtdzsw2013@163.com";
		final String password1 = "20132013";
		Properties props = new Properties();
		props.setProperty("mail.smtp.auth", "true");
		props.setProperty("mail.smtp.ssl.enable", "true");
		props.setProperty("mail.smtp.host", "smtp.163.com");
		props.put("mail.smtp.ssl.socketFactory",
				"javax.net.ssl.SSLSocketFactory");
		props.setProperty("mail.smtp.port", "465");
		Session session = Session.getDefaultInstance(props,
				new Authenticator() {
					protected PasswordAuthentication getPasswordAuthentication() {
						return new PasswordAuthentication(username1,
								password1);
					}
				});

		try {

			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(username1));
			message.setRecipient(Message.RecipientType.TO,new InternetAddress(mailaddress));
			message.setFrom(new InternetAddress(username1));
			message.setSubject("启航密码管理系统");
			message.setText("密码："+pwd);
			Transport.send(message);		

		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}

		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
