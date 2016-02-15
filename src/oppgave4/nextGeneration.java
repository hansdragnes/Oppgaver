package oppgave4;

public class nextGeneration {
	
	private gameboard gb;
	
	public nextGeneration(gameboard board) {
		gb=board;
	}
	/**
	 * Method counts and returns number of neighbours
	 * to a cell given by provided x and y param
	 * @param int x, int y
	 * @return number of neighbours
	 */
	int countNeighbours(int x, int y)	{
	
		int neighbours = 0;
		int cellValue = 0;
		
		
		for (int  i=-1; i<2 ; i++)
			for (int j=-1;j<2;j++){
				cellValue = gb.getTable()[x+i][y+j];
				if (!(i==0 && j==0) && (cellValue==1))
					neighbours++;
			}
			
		return neighbours;
	}
	 public boolean cellstatusNextgeneration(int x, int y){
		 int cn = countNeighbours(x,y);
		 
		 if (gb.getTable()[x][y]==1){
			if (survives(cn))
				return true;
			return false;
		 }
		 if (cn==3)
			 return true;
		 return false;
			 
	 }
	
	
	/**
	 * Method implements two rules
	 * 1) cell dies if number of neighbours is less than 2
	 * 2) cell dies if number of neighbours is greater than 3
	 * @param neighBours
	 * @return boolean
	 *  
	 */
	public boolean survives(int neighbours)	{
		boolean alive=true;
		
		if (( neighbours < 2) || (neighbours> 3))
				alive = false;
		return alive;
	}
	

	/**
	 * Method checks if current cell is dead or alive
	 * @param x coordinate
	 * @param y coordinate
	 * @return boolean
	 */
	public boolean isAlive(int x, int y)	{
		if (gb.getTable()[x][y]==1)
			return true;
		return false;
	}
}

