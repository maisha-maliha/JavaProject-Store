package application;

import javafx.event.ActionEvent;

public class AdminElectronicsController {
HomeController home = new HomeController();
	
	//========= ALL PAGE METHODS ========== 
	public void callHome(ActionEvent event) {
		home.ChangingToHome(event);
	}
	public void callFood(ActionEvent event) {
		home.ChangingToAdminFood(event);
	}
	public void callClothes(ActionEvent event) {
		home.ChangingToAdminClothes(event);
	}
	public void callElectronics(ActionEvent event) {
		home.ChangingToAdminElectronics(event);
	}
}
