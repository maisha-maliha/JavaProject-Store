package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
//import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class HomeController {
	private Stage stage;

	// ============= SCENE CHANGING METHODS ===========
	
	public void ChangingToUser(ActionEvent event) {
		try {
			AnchorPane userPane = (AnchorPane)FXMLLoader.load(getClass().getResource("User.fxml"));
			stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
			Scene user = new Scene(userPane);
			user.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			stage.setScene(user);
			stage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void ChangingToAdmin(ActionEvent event) {
		try {
			AnchorPane userPane = (AnchorPane)FXMLLoader.load(getClass().getResource("Admin.fxml"));
			stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
			Scene user = new Scene(userPane);
			user.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			stage.setScene(user);
			stage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void ChangingToHome(ActionEvent event) {
		try {
			AnchorPane userPane = (AnchorPane)FXMLLoader.load(getClass().getResource("Home.fxml"));
			stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
			Scene user = new Scene(userPane);
			user.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			stage.setScene(user);
			stage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void ChangingToFood(ActionEvent event) {
		try {
			AnchorPane userPane = (AnchorPane)FXMLLoader.load(getClass().getResource("Food.fxml"));
			stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
			Scene user = new Scene(userPane);
			user.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			stage.setScene(user);
			stage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void ChangingToElectronics(ActionEvent event) {
		try {
			AnchorPane userPane = (AnchorPane)FXMLLoader.load(getClass().getResource("Electronics.fxml"));
			stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
			Scene user = new Scene(userPane);
			user.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			stage.setScene(user);
			stage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void ChangingToClothes(ActionEvent event) {
		try {
			AnchorPane userPane = (AnchorPane)FXMLLoader.load(getClass().getResource("Clothes.fxml"));
			stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
			Scene user = new Scene(userPane);
			user.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			stage.setScene(user);
			stage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void ChangingToAdminFood(ActionEvent event) {
		try {
			AnchorPane userPane = (AnchorPane)FXMLLoader.load(getClass().getResource("AdminFood.fxml"));
			stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
			Scene user = new Scene(userPane);
			user.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			stage.setScene(user);
			stage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void ChangingToAdminElectronics(ActionEvent event) {
		try {
			AnchorPane userPane = (AnchorPane)FXMLLoader.load(getClass().getResource("AdminElectronics.fxml"));
			stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
			Scene user = new Scene(userPane);
			user.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			stage.setScene(user);
			stage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void ChangingToAdminClothes(ActionEvent event) {
		try {
			AnchorPane userPane = (AnchorPane)FXMLLoader.load(getClass().getResource("AdminClothes.fxml"));
			stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
			Scene user = new Scene(userPane);
			user.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			stage.setScene(user);
			stage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
