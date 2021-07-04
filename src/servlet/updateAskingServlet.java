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


@WebServlet("/updateAskingServlet")
public class updateAskingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//get values to the form
		String id = request.getParameter("id");
		String uname = request.getParameter("uname");
		String uid = request.getParameter("uid");
		String phone = request.getParameter("phone");
		String film = request.getParameter("film");
		String date = request.getParameter("date");
		
		boolean isTrue;
		//create object
		AskingInterface AskingInterface=new Askingdbutil();

		
		isTrue=AskingInterface.updateAsking1(id, uname, uid, phone, film, date);
		
		if(isTrue == true) {
			//when servlet process success do this
			List<Asking> upDetails = AskingInterface.getAskingDetails(id);
			request.setAttribute("upDetails", upDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("requestedDetails.jsp");
			dis.forward(request, response);
		}
		else {
			//when servlet process unsuccess do this
			List<Asking> upDetails = AskingInterface.getAskingDetails(id);
			request.setAttribute("upDetails", upDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("unsucess.jsp");
			dis.forward(request, response);
		}
	}

}





