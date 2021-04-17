package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;

public class ClothesController {
HomeController home = new HomeController();
	
	//========= ALL PAGE METHODS ========== 
	public void callHome(ActionEvent event) {
		home.ChangingToHome(event);
	}
	public void callCart(ActionEvent event) {
		home.ChangingToCart(event);
	}
	public void callFood(ActionEvent event) {
		home.ChangingToFood(event);
		
	}
	public void callClothes(ActionEvent event) throws Exception {
		home.ChangingToClothes(event);
	}
	public void callElectronics(ActionEvent event) {
		home.ChangingToElectronics(event);
	}
	
	
	
	@FXML
	public ListView<String> listview = new ListView<String>(); 
	
	public void showclothes() throws Exception {
		AdminClothesController admin = new AdminClothesController();
		
		File oldfile = new File(admin.currentfile);
		FileReader fr= new FileReader(oldfile);    
	    BufferedReader br=new BufferedReader(fr);   
	    Scanner fileScanner = new Scanner(fr); 
	    
	    while(fileScanner.hasNextLine()){
        	listview.getItems().add(fileScanner.nextLine());
        }
	    
	    br.close();    
        fr.close(); 
        fileScanner.close();
	}
}
