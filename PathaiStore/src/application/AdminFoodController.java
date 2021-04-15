package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
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
		readsfiles();
	}
	public void callElectronics(ActionEvent event) {
		home.ChangingToAdminElectronics(event);
	}
	
	//========= FOOD PAGE METHODS ==========
	
//	BufferReader read = new BufferReader();
	ArrayList<String> arrlist = new ArrayList<String>(100);
	
	public void readsfiles() throws Exception{
		FileReader fr=new FileReader("src/application/FoodIteamName.txt");    
        BufferedReader br=new BufferedReader(fr);    
   int na = br.readLine().length();
        System.out.println(br.readLine() + " and "+ na);
        
        br.close();    
        fr.close(); 
	}
	
	@FXML
	public ListView<String> listview;

	
}
