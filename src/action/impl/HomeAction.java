package action.impl;

import javax.servlet.http.HttpServletRequest;

import action.AbstractAction;

public class HomeAction extends AbstractAction {

	@Override
	public String execute(HttpServletRequest request) {

	return "/WEB-INF/pages/home.jsp";
	}

}
