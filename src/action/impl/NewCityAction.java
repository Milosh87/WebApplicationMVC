package action.impl;

import javax.servlet.http.HttpServletRequest;

import action.AbstractAction;

public class NewCityAction extends AbstractAction {

	@Override
	public String execute(HttpServletRequest request) {
		// TODO Auto-generated method stub
		return "/WEB-INF/pages/newcity.jsp";
	}

}
