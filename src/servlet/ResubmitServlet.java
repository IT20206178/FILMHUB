package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Asking;
import service.AskingInterface;
import service.Askingdbutil;


@WebServlet("/ResubmitServlet")
public class ResubmitServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		
		//get parameter values from the form
		String uname = request.getParameter("login");
		String uid = request.getParameter("plogin");
		boolean isTrue;
		//create object
		AskingInterface AskingInterface=new Askingdbutil();

		
		isTrue=AskingInterface.validate(uname,uid);
		
		if(isTrue==true) {
			//when servlet process success do this
			List<Asking> upDetails =AskingInterface.getAsking(uname);
			request.setAttribute("upDetails", upDetails);
			
			RequestDispatcher dis =request.getRequestDispatcher("requestedDetails.jsp");
			dis.forward(request, response);
		}else {
			//when servlet process unsuccess do this
			out.println("<script type='text/javascript'>"); //start js message
			out.println("alert('Your user name or user id incorect');"); //message display to user
			out.println("location='Resubmit.jsp'");
			out.println("</script>");
		}
		
	
		
	}

}




