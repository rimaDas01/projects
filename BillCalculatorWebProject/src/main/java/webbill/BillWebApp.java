package webbill;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BillWebApp extends HttpServlet {
	@Override
	public void init(ServletConfig config)throws ServletException {
		System.out.println("Servlet initialized");
	}
	@Override
    public void destroy() {
        System.out.println("Servlet destroyed");
}
    
    @Override
    public void service(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
    	PrintWriter out=res.getWriter();
    	double unitPrice= Double.parseDouble( req.getParameter("unitPrice"));
    	double tax =  Double.parseDouble(req.getParameter("tax"));
    	int units= Integer.parseInt( req.getParameter("units"));
    	double price = ((unitPrice+(unitPrice*tax))*units);
    	out.println("Bill :$"+price);
    	out.close();
    }
}
