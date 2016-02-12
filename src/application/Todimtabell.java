package application;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;

public class Todimtabell {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		draw();
		
	}
	
	public static void tab()	{
		
		int[][] tab = new int[][]		{
										{1, 2, 3},
										{10, 20, 30},
										{100, 200, 300},
										{1000, 2000, 3000}
										};
		
//		tab[0][0]="h";
//		tab[0][1]="a";
//		tab[1][0]="n";
//		tab[1][1]="s";
				
		for (int i=0; i < tab.length; i++)	{
			for (int j = 0; j < tab[i].length; j++)	{
				
				System.out.print(tab[i][j]);
				if (j < tab[i].length-1)
					System.out.print(", ");
			}
			System.out.println();
			
				
		}
	}
	
	public static void draw(){
		final Rectangle rectBasicTimeline = new Rectangle(100, 50, 100, 50);
		rectBasicTimeline.setFill(Color.RED);
		
		final Timeline timeline = new Timeline();
		timeline.setCycleCount(Timeline.INDEFINITE);
		timeline.setAutoReverse(true);
		final KeyValue kv = new KeyValue(rectBasicTimeline.xProperty(), 300);
		final KeyFrame kf = new KeyFrame(Duration.millis(500), kv);
		timeline.getKeyFrames().add(kf);
		timeline.play();
	}

}
