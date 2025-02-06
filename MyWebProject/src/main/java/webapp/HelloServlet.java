package webapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet{
    
    @Override
    public void init(ServletConfig config)throws ServletException{
        System.out.println("Servlet initialized");
    }
    
    @Override
    public void destroy() {
        System.out.println("Servlet destroyed");
}
    
    @Override
    public void service(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
//        System.out.println("Servlet in service");
    	PrintWriter out=res.getWriter();
//    	out.println("Hello Rima!");
    	
    	String name=req.getParameter("username");
    	out.println("Hello "+name);
    	String role=req.getParameter("role");
    	out.println("\nYour job role: "+role);
    	
    	out.close();
    }
}
