package action.impl;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import action.AbstractAction;
import city.City;

public class RemoveCityAction extends AbstractAction{

	@Override
	public String execute(HttpServletRequest request) {
		// TODO Auto-generated method stub
		List<City> cities = (List<City>) request.getServletContext().getAttribute("cities");
		City removeCity = new City();
		removeCity.setPostanskiBroj(Integer.parseInt(request.getParameter("ptt")));
		cities.remove(removeCity);
		request.getServletContext().setAttribute("cities", cities);
		return "../city/all";
	}

}
