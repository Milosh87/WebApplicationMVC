package action.impl;

import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import action.AbstractAction;
import user.User;

public class LoginAction extends AbstractAction{

	@Override
	public String execute(HttpServletRequest request) {
		String username =  request.getParameter("user");
		String password =  request.getParameter("pass");
//		String page = "login.jsp";
//		try {
//			User user = new User(username, password);
//			validator.validate(user);
//		}
//		catch(Exception e) {
//			request.setAttribute("validationError", e.getMessage());
//		}
		User newUser = new User(username,password);
		
		List<User> users = (List<User>) request.getServletContext().getAttribute("users");

		
		if(users.contains(newUser)) {
			HttpSession session = request.getSession();
			session.setAttribute("user", newUser);
			session.setAttribute("logged", "logged in as: " + newUser.getUsername());
			return "/WEB-INF/pages/home.jsp";
		}
	else {
		request.setAttribute("error", "user doesn't exist");
		return "/login.jsp";
	}
		
		
	}
	
	

}
