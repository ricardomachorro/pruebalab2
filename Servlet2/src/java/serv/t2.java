
package serv;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class t2 extends HttpServlet{
    
    @Override
    protected void doPost(HttpServletRequest req,HttpServletResponse res )
            throws ServletException,IOException{
            String t1=req.getParameter("t1");
            PrintWriter esc=res.getWriter();
            esc.println("<html>");
            esc.println("<head>");
            esc.println("<body>");
            esc.println("It Works");
            esc.println(t1);
            esc.println("</body>");
            esc.println("</head>");
            esc.println("</html>");
    }
}
