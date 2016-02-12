package oppgave4;

public class nextGeneration {
	
	private gameboard gb;
	
	public nextGeneration(gameboard board) {
		gb=board;
	}
	/**
	 * Method counts and returns number of neighbours
	 * @return number of neighbours
	 */
	int countNeighbours()	{
	
		int neighbours = 0;
		int cellValue = 0;
		for (int  i=0; i<3 ; i++)
			for (int j=0;j<3;j++){
				cellValue = gb.getTable()[i][j];
				if (!(i==1 && j==1) && (cellValue==1))
					neighbours++;
			}
			
		return neighbours;
	}
	/**
	 * Method implements two rules
	 * 1) cell dies if number of neighbours is less than 2
	 * 2) cell dies if number of neighbours is greater than 3
	 * @param countNeighbours
	 * @return boolean
	 *  
	 */
	public boolean staysAlive()	{
		boolean alive=true;
		
		if ((countNeighbours() < 2) || (countNeighbours()> 3))
				alive = false;
		
		return alive;
	}
	
	
	/**
	 * Method checks whether a cell has neighbours
	 * @return boolean
	 */
	public boolean hasNeighbours()	{
		if (countNeighbours()!=0)
			return true;
		else
			return false;
	}
	
	/**
	 * Method decides if a dead cell will be alive
	 */
	public boolean born()	{
		if (countNeighbours()==3)
			return true;
		return false;		
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
		else return false;
	}
}

