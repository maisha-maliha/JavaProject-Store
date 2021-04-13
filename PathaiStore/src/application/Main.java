package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
//import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
			AnchorPane homePane = (AnchorPane)FXMLLoader.load(getClass().getResource("Home.fxml"));
			Scene home = new Scene(homePane);
			home.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(home);
			primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
