package servlet_lifecycle;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

//@WebServlet("/demo")
@WebServlet(urlPatterns="/demo",loadOnStartup=1)
public class Demo implements Servlet
{
	
	static {
		System.out.println("class is loaded");
	}
	public Demo(){
		System.out.println("object demo is created");
	}

	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("destroy method is called");
	}

	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println(("init method is called"));
		
	}

	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("service method is called");
	}

}
