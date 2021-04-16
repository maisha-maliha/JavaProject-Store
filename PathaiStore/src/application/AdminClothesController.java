package application;

import javafx.event.ActionEvent;

public class AdminClothesController {
	HomeController home = new HomeController();
	AdminFoodController adminfood = new AdminFoodController();
	
	
	//========= ALL PAGE METHODS ========== 
	public void callHome(ActionEvent event) {
		home.ChangingToHome(event);
	}
	public void callFood(ActionEvent event) throws Exception {
		home.ChangingToAdminFood(event);
	}
	public void callClothes(ActionEvent event) {
		home.ChangingToAdminClothes(event);
	}
	public void callElectronics(ActionEvent event) {
		home.ChangingToAdminElectronics(event);
	}
	
	
}
