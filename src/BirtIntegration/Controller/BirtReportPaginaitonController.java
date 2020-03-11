package BirtIntegration.Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import BirtIntegration.BirtViewer.ReportProcessor;


public class BirtReportPaginaitonController extends HttpServlet {

	
	
	@Override
	public void  init(){
	 
	}
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession httpSession = request.getSession();
		long pageCount = (Long) httpSession.getAttribute("pageCount");
		System.out.println("pageCount: "+pageCount);
		response.getWriter().write(""+pageCount);
		response.flushBuffer();
		
		
	}
	@Override
	  public void doPost(HttpServletRequest request,
              HttpServletResponse response)
            throws ServletException, IOException {
		  doGet(request, response);
     }
	
}
