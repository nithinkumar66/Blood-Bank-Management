package blood;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Dell")
public class Delete  extends HttpServlet
{
     
     
	@Override
	protected void doPost(HttpServletRequest req,HttpServletResponse resp)throws ServletException,IOException{
		 resp.setContentType("text/html");
		PrintWriter out =resp.getWriter();
	String myname=req.getParameter("name1");
	String myemail=req.getParameter("email");

	 
	 
	  try {
	 
	
		 Class.forName("com.mysql.cj.jdbc.Driver");
		 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bro","root","root");
		 
		 PreparedStatement ps=con.prepareStatement("delete from donor where name=? and  email=?");
		 
		 ps.setString(1, myname);
		 ps.setString(2, myemail );
		 
		 
		 
		 
		 
		 
		 int count = ps.executeUpdate();
		 if(count > 0){
			 out.print("<br><br><center><h1 style='color:green'> Donor Details Deleted Successfully </h1></center>");
			 
			 RequestDispatcher rd= req.getRequestDispatcher("/deactivate.jsp");
			 rd.include(req, resp);
		 }
		 else 
		 {
			 
				out.print("<center><h1 style='color:red'> Unable to Delete Details  </h1></center>");
			 
			 RequestDispatcher rd= req.getRequestDispatcher("/deactivate.jsp");
			 rd.include(req, resp);
		  }
	 
	}
	catch(Exception e){
		 e.printStackTrace();
		
			out.print("<h3 style='color:red'>user registered"+e.getMessage()+"</h3>");
		 
		 RequestDispatcher rd= req.getRequestDispatcher("/deactivate.jsp");
		 rd.include(req, resp);
	}

	
	 
	}
}