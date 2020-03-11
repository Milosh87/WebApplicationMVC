package action.impl;

import javax.servlet.http.HttpServletRequest;

import action.AbstractAction;

public class EditCityAction extends AbstractAction {

	@Override
	public String execute(HttpServletRequest request) {
		// TODO Auto-generated method stub
		request.setAttribute("ptt", (String) request.getParameter("ptt"));
		request.setAttribute("ime", (String) request.getParameter("ime"));
		return "/WEB-INF/pages/editCity.jsp";
	}
	
}
