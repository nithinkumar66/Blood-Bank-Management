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

@WebServlet("/Requests")
public class Request extends HttpServlet
{
     
     
	@Override
	protected void doPost(HttpServletRequest req,HttpServletResponse resp)throws ServletException,IOException{
		 resp.setContentType("text/html");
		PrintWriter out =resp.getWriter();
	String myname=req.getParameter("name1");
	String myblood=req.getParameter("bloodgroup");
	String myreqdate=req.getParameter("requireddate");
	 String mymobile=req.getParameter("mobile");
	String mygender=req.getParameter("gender");
	 String mylocation=req.getParameter("location");
	 String mybloodunits=req.getParameter("units");
	 
	 
	 
	  try {
	 
	
		 Class.forName("com.mysql.cj.jdbc.Driver");
		 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bro","root","root");
		 
		 PreparedStatement ps=con.prepareStatement("insert into receiver values(?,?,?,?,?,?,?)");
		 
		 ps.setString(1, myname);
		 ps.setString(2, myblood);
		 ps.setString(3, myreqdate);
		 ps.setString(4, mymobile);
		 ps.setString(5, mygender);
		 ps.setString(6, mylocation);
		 ps.setString(7, mybloodunits);
		
		 
		 
		 
		 
		 int count = ps.executeUpdate();
		 if(count > 0){
			 out.print("<br><br><center><h1 style='color:green'>RECEIVER  REGISTERED  </h1></center>");
			 
			 RequestDispatcher rd= req.getRequestDispatcher("/request.html");
			 rd.include(req, resp);
		 }
		 else 
		 {
			 
				out.print("<center><h1 style='color:red'>RECEIVER NOT REGISTERED DUE TO ERROR  </h1></center>");
			 
			 RequestDispatcher rd= req.getRequestDispatcher("/request.html");
			 rd.include(req, resp);
		  }
	 
	}
	catch(Exception e){
		 e.printStackTrace();
		
			out.print("<h3 style='color:red'>user registered"+e.getMessage()+"</h3>");
		 
		 RequestDispatcher rd= req.getRequestDispatcher("/request.html");
		 rd.include(req, resp);
	}
	
	
	 
	}
}
