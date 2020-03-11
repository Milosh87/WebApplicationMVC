package action.impl;

import javax.servlet.http.HttpServletRequest;



import action.AbstractAction;

public class ListAllCityAction  extends AbstractAction{

	@Override
	public String execute(HttpServletRequest request) {
		return "/WEB-INF/pages/allcities.jsp";


	}

}
