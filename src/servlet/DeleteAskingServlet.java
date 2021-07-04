package servlet;

import java.io.IOException;
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


@WebServlet("/DeleteAskingServlet")
public class DeleteAskingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
 
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("id");
		boolean isTrue;
		
		//create object
		AskingInterface AskingInterface=new Askingdbutil();
		
		isTrue = AskingInterface.deleteAsking(id);
		
		if (isTrue == true) {
			//when servlet process success do this
			RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
			dispatcher.forward(request, response);
		}
		else {
			//when servlet process unsuccess do this
			List<Asking> upDetails = AskingInterface. getAskingDetails(id);
			request.setAttribute("upDetails", upDetails);
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("requestedDetails.jsp");
			dispatcher.forward(request, response);
		
		
		
		
	}	
}
}


