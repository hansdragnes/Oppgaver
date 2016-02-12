package FXML_eksempel;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.fxml.FXMLLoader;

/*
 * Opprett JavaFX GUI program. Bruk FXMLLoader for � laste inn FXML
 * som beskriver GUI.
 */

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
	       
		Scene scene = new Scene(root, 800, 600);
	    
		primaryStage.setTitle("FXML eksempel, med grafikk");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
