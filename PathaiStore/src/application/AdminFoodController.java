package application;

import java.io.BufferedReader;
import java.io.FileReader;

import java.util.Scanner;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import javafx.scene.control.ListView;

public class AdminFoodController {
	HomeController home = new HomeController();
	
	//========= ALL PAGE METHODS ========== 
	public void callHome(ActionEvent event) {
		home.ChangingToHome(event);
	}
	public void callFood(ActionEvent event) {
		home.ChangingToAdminFood(event);
		
	}
	public void callClothes(ActionEvent event) throws Exception {
		home.ChangingToAdminClothes(event);
	}
	public void callElectronics(ActionEvent event) {
		home.ChangingToAdminElectronics(event);
	}
	
	//========= FOOD PAGE METHODS ==========
	@FXML
	public ListView<String> listview = new ListView<String>(); 
	
	public void readsfiles() throws Exception{
		FileReader fr=new FileReader("src/application/FoodIteamName.txt");    
        BufferedReader br=new BufferedReader(fr);   
        Scanner fileScanner = new Scanner(fr);

        while(fileScanner.hasNextLine()){
        	listview.getItems().add(fileScanner.nextLine());
        }
        fileScanner.close();
        br.close();    
        fr.close(); 
	}
	public void btnact(ActionEvent event) throws Exception {
		readsfiles();
	}

}
