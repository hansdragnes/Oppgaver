package application;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class GameController {

	
	private byte[][] board = {
			{ 1, 1},
			{ 0, 1}
			
	};
	/**
	 * @param gc
	 */
		
	public void drawShapes(GraphicsContext gc)	{
		
		if (board[0][0]==1){
			gc.setFill(Color.GREEN);
			gc.fillRect(40, 10, 15, 15);
		}
		if (board[0][1]==1){
			gc.setFill(Color.GREEN);
			gc.fillRect(40, 30, 15, 15);
		}
		if (board[1][0]==1){
			gc.setFill(Color.GREEN);
			gc.fillRect(70, 10, 15, 15);
		}
		if (board[1][1]==1){
			gc.setFill(Color.GREEN);
			gc.fillRect(70, 30, 15, 15);
		}
		
	}
}
