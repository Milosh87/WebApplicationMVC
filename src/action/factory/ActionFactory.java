package action.factory;

import action.AbstractAction;
import action.impl.AddCityAction;
import action.impl.EditCityAction;
import action.impl.EditedNameAction;
import action.impl.HomeAction;
import action.impl.ListAllCityAction;
import action.impl.LoginAction;
import action.impl.LogoutAction;
import action.impl.NewCityAction;
import action.impl.RemoveCityAction;

public class ActionFactory {
	public static AbstractAction createActionFactory(String actionName) {
		 AbstractAction action = null;
		if(actionName.equalsIgnoreCase("/login")) {
			 action = new LoginAction();

		}
		if(actionName.equalsIgnoreCase("/logout")) {
			 action = new LogoutAction();
			
		}
		if(actionName.equalsIgnoreCase("/home")) {
			System.out.println("Home factory");
			 action = new HomeAction();
			
		}
		if(actionName.equalsIgnoreCase("/city/new")) {
			System.out.println("Add city ");
			 action = new AddCityAction();
			
		}
		if(actionName.equalsIgnoreCase("/city/newForm")) {
			 action = new NewCityAction();
			
		}
		if(actionName.equalsIgnoreCase("/city/all")) {
			System.out.println("List all cities");
			 action = new ListAllCityAction();
			
		}
		if(actionName.equalsIgnoreCase("/city/edit")) {
			System.out.println("Edit city");
			 action = new EditCityAction();
			
		}
		if(actionName.equalsIgnoreCase("/city/remove")) {
			System.out.println("Remove city");
			 action = new RemoveCityAction();
			
		}
		if(actionName.equalsIgnoreCase("/city/editedName")) {
			System.out.println("Remove city");
			 action = new EditedNameAction();
			
		}
		return action;
	}
}
