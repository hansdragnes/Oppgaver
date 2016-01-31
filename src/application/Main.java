package application;
	
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class Main extends Application {
	
	public static void main(String[] args) {
		launch(args);
	}
		
	@Override
	public void start(Stage stage) {
		stage.setTitle("Testing canvas");
		Group root = new Group();
		Canvas canvas = new Canvas(300, 250);
		GraphicsContext gc = canvas.getGraphicsContext2D();
		drawShapes(gc);
		root.getChildren().add(canvas);
		stage.setScene(new Scene(root));
		stage.show();
		
	}
	
	/**
	 * @param gc
	 */
	public void drawShapes(GraphicsContext gc)	{
		gc.setFill(Color.GREEN);
		
		gc.fillRect(40, 10, 15, 15);
	}
}
