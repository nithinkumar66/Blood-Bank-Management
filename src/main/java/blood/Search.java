package blood;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.cj.jdbc.result.ResultSetMetaData;

@WebServlet("/SearchForm")
public class Search  extends HttpServlet
{
     
     
	@Override
	protected void doPost(HttpServletRequest req,HttpServletResponse resp)throws ServletException,IOException{
		 
		PrintWriter out =resp.getWriter();
	
	 String myblood=req.getParameter("bloodgroup");
	 
	 
	 
	 
	 try {
		 Class.forName("com.mysql.cj.jdbc.Driver");
		 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bro","root","root");
		 
		 PreparedStatement ps=con.prepareStatement("select * from donor where bloodgroup=? ");
		 
		
		 ps.setString(1, myblood);
		 
		 
		 out.println("<!DOCTYPE html>");
         out.println("<html>");
         out.println("<head>");
          out.println("<style>");
          out.println("body{\r\n"
          		+ "        background-image: url(https://williamsinstitute.law.ucla.edu/wp-content/uploads/WI-health_03b_s.jpg);\r\n"
          		+ "        background-size: cover;\r\n"
          		+ "        }");
          out.println("h1{\r\n"
          		+ "      color: green;\r\n"
          		+ "      font-style: Arial;\r\n"
          		+ "      font-size:40px;\r\n"
          		+ "      text-align: center;\r\n"
          		+ "      }"
          		+ ".don{border-radius:7px;"
          		+ "border-color:gold;"
          		+ "text-align:center;"
          		+ "font-size:18px;}"
          		+ ".head{color:red;}");
           out.println("</style>");      
         out.println("</head>");
         out.println("<body>");
         
         
		 
		 out.println("<center>");
		 out.print("<br><br><br><br><br><br><br><h1>Donors Found </h1><br><table width=50% border=16 class=don>");  
		   
		   
		 ResultSet rs=ps.executeQuery();  
		               
		 ResultSetMetaData rsmd = (ResultSetMetaData) rs.getMetaData();  
		 int total=rsmd.getColumnCount();  
		 out.print("<tr>");  
		 for(int i=1;i<=total;i++)  
		 {  
		 out.print("<th class=head>"+rsmd.getColumnName(i)+"</th>");  
		 } 
		 
		   
		 out.print("</tr>");  
		               
		 /* Printing result */  
		 while(rs.next())  
		 {  
		 out.print("<tr><td>"+rs.getString(1)+"</td><td>"+rs.getString(2)+"</td><td>"+rs.getString(3)+"</td><td>"+rs.getString(4)+"</td><td>"+rs.getString(5)+"</td><td>"+rs.getString(6)+"</td></tr>");  
		                   
		 } 
		 
		  
		 out.print("</table>");
		 out.println("</center>");
		 out.println("</body>");
         out.println("</html>");}
		 
		 
		 
		 
		 
	 catch(Exception e){
		 e.printStackTrace();
		 resp.setContentType("text/html");
			out.print("<h3 style='color:red'>  "+e.getMessage()+"</h3>");
		 
		 
	}
}
}