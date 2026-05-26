html
<!DOCTYPE html>
<html>
<body>
<a href="cookie">Create Cookie</a>
</body>
</html>




import java.io.
*;
import javax.servlet.
*;
import javax.servlet.http.
*;
public class CookieServlet extends HttpServlet
{
public void doGet(HttpServletRequest req,
HttpServletResponse res)
throws ServletException, IOException
{
res.setContentType("text/html");
PrintWriter out = res.getWriter();
Cookie c = new Cookie("EMPID"
,
"AN2356");
res.addCookie(c);
out.println("<h2>Cookie Details</h2>");
out.println("Cookie Name : "+c.getName()+"<br>");
out.println("Cookie Value : "+c.getValue());
}
}



<web-app>
<servlet>
<servlet-name>abc</servlet-name>
<servlet-class>CookieServlet</servlet-class>
</servlet>
<servlet-mapping>
<servlet-name>abc</servlet-name>
<url-pattern>/cookie</url-pattern>
</servlet-mapping>
</web-app>