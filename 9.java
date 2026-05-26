 Code
<!DOCTYPE html>
<html>
<head>
<title>Student Details</title>
</head>
<body>
<h2>Enter Student Details</h2>
<form action="StudentServlet" method="get">
Name:
<input type="text" name="sname">
<br><br>
USN:
<input type="text" name="usn">
<br><br>
Total Marks:
<input type="text" name="marks">
<br><br>
<input type="submit" value="Submit">
</form>
</body>
</html>





import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class StudentServlet extends HttpServlet
{
public void doGet(HttpServletRequest request,
HttpServletResponse response)
throws ServletException, IOException
{
String name = request.getParameter("sname");
String usn = request.getParameter("usn");
String marks = request.getParameter("marks");
response.setContentType("text/html");
PrintWriter out = response.getWriter();
out.println("<html><body>");
out.println("<h2>Student Details</h2>");
out.println("<h3>Name : " + name + "</h3>");
out.println("<h3>USN : " + usn + "</h3>");
out.println("<h3>Total Marks : " + marks + "</h3>");
out.println("</body></html>");
}
}






 Code
<web-app>
<servlet>
<servlet-name>StudentServlet</servlet-name>
<servlet-class>StudentServlet</servlet-class>
</servlet>
<servlet-mapping>
<servlet-name>StudentServlet</servlet-name>
<url-pattern>/StudentServlet</url-pattern>
</servlet-mapping>
</web-app>