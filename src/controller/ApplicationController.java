package controller;

import javax.servlet.http.HttpServletRequest;

import action.AbstractAction;
import action.factory.ActionFactory;
import action.impl.LoginAction;
import action.impl.LogoutAction;

public class ApplicationController {

	public String processRequest(String pathInfo, HttpServletRequest request) {
		// u zavisnosti od toga koji je pathInfo prosledjen kreirati 
		//odgovarajucu klasu koja je zaduzena za obradu zahteva
		String page = "/WEB-INF/pages/error/defaultErrorPage.jsp";
	
		AbstractAction action = ActionFactory.createActionFactory(pathInfo);
		// if action == null nije mapiran url na akciju
		if(action != null) {
			page = action.execute(request);
		} else {
			request.setAttribute("error",  "Action " + pathInfo + " is not mapped to action.");
		}
		return page;
	}
	
	

	
	
}
