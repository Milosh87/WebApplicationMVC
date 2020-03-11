package action.impl;

import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;

import action.AbstractAction;
import city.City;

public class EditedNameAction extends AbstractAction {

	@Override
	public String execute(HttpServletRequest request) {
		// TODO Auto-generated method stub
		String ime = request.getParameter("editovanoIme");
		int ptt = Integer.parseInt(request.getParameter("ptt"));
		List<City> cities = (List<City>) request.getServletContext().getAttribute("cities");
		for (City c : cities) {
			if (c.getPostanskiBroj() == ptt) {
				c.setIme(ime);
			}
		}
		request.getServletContext().setAttribute("cities", cities);
		return "../city/all";
	}

}
