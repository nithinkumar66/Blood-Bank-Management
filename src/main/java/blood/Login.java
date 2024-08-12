package blood;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginForm")
public class Login  extends HttpServlet
{
     
     
	@Override
	protected void doPost(HttpServletRequest req,HttpServletResponse resp)throws ServletException,IOException{
		 
		PrintWriter out =resp.getWriter();
	
	 String myemail=req.getParameter("email");
	 String mypass=req.getParameter("pass");
	 
	 
	 
	 try {
		 Class.forName("com.mysql.cj.jdbc.Driver");
		 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bro","root","root");
		 
		 PreparedStatement ps=con.prepareStatement("select * from blood where email=? and password=?");
		 
		
		 ps.setString(1, myemail);
		 ps.setString(2, mypass);
		 
		 
		 
		 ResultSet rs = ps.executeQuery();
		 if(rs.next()){
			
			 RequestDispatcher rd= req.getRequestDispatcher("/port.html");
			 rd.include(req, resp);
		 }
		 else {
			 resp.setContentType("text/html");
				
			 out.print("<center><br><br><h3  style='color:black'>login didn't match </h3><center>");
			 RequestDispatcher rd= req.getRequestDispatcher("/login.jsp");
			 rd.include(req, resp);
		 }
		 
	 }
	 catch(Exception e){
		 e.printStackTrace();
		 resp.setContentType("text/html");
			out.print("<h3 style='color:red'>  "+e.getMessage()+"</h3>");
		 
		 RequestDispatcher rd= req.getRequestDispatcher("/login.jsp");
		 rd.include(req, resp);
	}
}
}