package application;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class GameController {

	
	private byte[][] board = {
			{ 1, 0},
			{ 0, 0}
			
	};
	/**
	 * @param gc
	 */
		
	public void drawShapes(GraphicsContext gc)	{
		
		if (board[0][0]==1){
			gc.setFill(Color.GREEN);
			gc.fillRect(40, 10, 10, 10);
		}
		if (board[1][0]==1){
			gc.setFill(Color.GREEN);
			gc.fillRect(40, 20, 10, 10);
		}
		if (board[0][1]==1){
			gc.setFill(Color.GREEN);
			gc.fillRect(50, 10, 10, 10);
		}
		if (board[1][1]==1){
			gc.setFill(Color.GREEN);
			gc.fillRect(50, 20, 10, 10);
		}
		
	}
}
