package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) throws IOException {
		//ALL CONTAINERS
		AnchorPane homePane = (AnchorPane)FXMLLoader.load(getClass().getResource("Home.fxml"));
		AnchorPane userPane = (AnchorPane)FXMLLoader.load(getClass().getResource("User.fxml"));
		AnchorPane adminPane = (AnchorPane)FXMLLoader.load(getClass().getResource("Admin.fxml"));
		AnchorPane foodPane = (AnchorPane)FXMLLoader.load(getClass().getResource("Food.fxml"));
		AnchorPane electronicsPane = (AnchorPane)FXMLLoader.load(getClass().getResource("Electronics.fxml"));
		AnchorPane clothesPane = (AnchorPane)FXMLLoader.load(getClass().getResource("Clothes.fxml"));
		//ALL SCENES
		Scene home = new Scene(homePane);
		Scene admin = new Scene(adminPane);
		Scene user = new Scene(userPane);
		Scene food = new Scene(foodPane);
		Scene electronics = new Scene(electronicsPane);
		Scene clothes = new Scene(clothesPane);
		//ALL STYLES
		home.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		admin.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		user.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		food.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		electronics.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		clothes.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		
		//FIRST SHOWN
		primaryStage.setScene(home);
		primaryStage.show();
		
		//ALL METHODES
		
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
