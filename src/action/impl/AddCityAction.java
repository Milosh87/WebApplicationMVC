package action.impl;

import java.awt.print.Pageable;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;

import action.AbstractAction;
import city.City;

public class AddCityAction extends AbstractAction {

	@Override
	public String execute(HttpServletRequest request) {
	
		String ime = request.getParameter("ime");
		boolean signal = true;
		int pttBroj = 0;
		String page = "../application/home";
		try {
			pttBroj = Integer.parseInt(request.getParameter("ptt"));
		} catch (Exception e) {
		
			signal = false;
			request.setAttribute("ime", request.getParameter("ime"));
			request.setAttribute("ptt", request.getParameter("ptt"));
			request.setAttribute("error", "Ptt: Not a number!");
			 page = "../city/newForm";
		}
		if(request.getParameter("ptt") == null) {
			request.setAttribute("error", "");
		}
		if (signal) {
			System.out.println("Usao u signal");
			City city = new City(ime, pttBroj);
			List<City> cities = (List<City>) request.getServletContext().getAttribute("cities");
			if (!cities.contains(city)) {
				System.out.println("Usao nema city");
				cities.add(city);
				request.getServletContext().setAttribute("cities", cities);
				page = "../city/all";
			} else {
				request.setAttribute("ime", request.getParameter("ime"));
				request.setAttribute("ptt", request.getParameter("ptt"));
				request.setAttribute("error", "City already exists");
				page = "../city/newForm";
			}

		}
		return page;

	}

}
