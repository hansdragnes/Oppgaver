package oppgave4;

public class rules {
		
	
	int countNeighbours(int[][] tabell)	{
	
	int cellsAlive = 0;
	int cellValue = 0;
	for (int  i=0; i<3 ; i++)
		for (int j=0;j<3;j++){
			cellValue = tabell[i][j];
			if (!(i==1 && j==1) && (cellValue==1))
				cellsAlive++;
		}
		
		return cellsAlive;
	}
	
	public boolean staysAlive(int countNeighbours)	{
		boolean alive=true;
		
		if ((countNeighbours < 2) || (countNeighbours> 4))
				alive = false;
		
		return alive;
	}

			
			
		
		
		
		public boolean hasNeighbours(){
			return true;
		}
}
