package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.AskingInterface;
import service.Askingdbutil;


@WebServlet("/AskingFilmServlet")
public class AskingFilmServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//get values to the parameters from form
		String uname = request.getParameter("login");
		String uid = request.getParameter("email");
		String phone = request.getParameter("contact");
		String film = request.getParameter("uname");
		String date = request.getParameter("password1");
		
		boolean isTrue;
		//create object
		AskingInterface AskingInterface=new Askingdbutil();
		
		isTrue= AskingInterface.insertAsking(uname, uid, phone, film, date);
		if(isTrue==true) {
			//when servlet process success do this
			RequestDispatcher dis=request.getRequestDispatcher("Askingsucess.jsp");
			dis.forward(request,response);
			
		}else
		{
			//when servlet process unsuccess do this
			RequestDispatcher dis2=request.getRequestDispatcher("unsucess.jsp");
			dis2.forward(request,response);
		}
		
		
	}

}


