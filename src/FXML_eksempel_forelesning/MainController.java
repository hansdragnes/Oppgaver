package FXML_eksempel_forelesning;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class MainController implements Initializable {

	@FXML private Button button1;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
	}
	
	public void handleButton1Event() {
		button1.setText("TEKSTEN BLE\nENDRET!");
	}
	
	public void handleChoice1() {
		button1.setText("KNAPP 1");
	}
	
}
