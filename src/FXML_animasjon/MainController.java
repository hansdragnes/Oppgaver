package FXML_animasjon;

import javafx.animation.Animation;
import javafx.animation.Animation.Status;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;
import javafx.util.Duration;

/*
 * Demonstrasjon av animasjon i JavaFX.
 */

public class MainController implements Initializable {
	
	private static class Point {
		public double x,y;
		public Point(){}
		public Point(double x, double y) {
			this.x = x;
			this.y = y;
		}
		public void draw(GraphicsContext gc, Color drawColor, double size) {
			gc.setFill(drawColor);
			gc.fillArc(x, y, size, size, 0, 360, ArcType.ROUND);
		}
	}
	
	@FXML private Canvas graphics;
	private Point point;
	private double theta; // data for � bevege punktet i en sirkul�r sti
	private final Point ORIGIN = new Point(350.0,250.0);
	private final double RADIUS = 200;
	private final double FPS = 60; // frames per second
	private Timeline timeline; // hovedklasse for � muliggj�re animasjon
	
	public void initialize(java.net.URL location,
            java.util.ResourceBundle resources) {
		// initialise point data
		point = new Point();
		theta = 0;
		updatePoint();
		
		// initialise animation data
		Duration duration = Duration.millis(1000/FPS);
		KeyFrame keyframe = new KeyFrame(duration, (ActionEvent e) -> {draw();});
		timeline = new Timeline();
		timeline.setCycleCount(Animation.INDEFINITE);
		timeline.getKeyFrames().add(keyframe);
		
		draw();
	}
	
	/*
	 * Hjelpemetoder for � muliggj�re animasjonen
	 */
	
	private void draw() {
		GraphicsContext gc = graphics.getGraphicsContext2D();
		gc.clearRect(0, 0, graphics.widthProperty().doubleValue(), graphics.heightProperty().doubleValue());
		point.draw(gc, Color.RED, 50.0);
		
		// oppdater punktet for hvert bilde som tegnes, slik at den 'beveger' seg for hvert bilde.
		updateAngle();
		updatePoint();
	}
	
	private void updateAngle() {
		if(theta >= 2*Math.PI) theta = 0;
		else theta += 0.1;
	}
	
	private void updatePoint() {
		point.x = RADIUS*Math.cos(theta) + ORIGIN.x;
		point.y = RADIUS*Math.sin(theta) + ORIGIN.y;
	}
	
	// start (eller angi pause) ved mellomrom-knappen
	public void handleKeyEvent(KeyEvent e) {
		if(e.getCode() == KeyCode.SPACE) {
			if(timeline.getStatus() == Status.RUNNING) {
				timeline.pause();
			} else {
				timeline.play();
			}
		}
	}

}
