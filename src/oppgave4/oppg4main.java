package oppgave4;

public class oppg4main {

	public static void main(String[] args) {
		
		gameboard gb = new gameboard();
		nextGeneration ng = new nextGeneration(gb);
		
		boolean currentCell = false;
		boolean alive = false;
		
		int x = 2;
		int y = 1;
		
		System.out.println("Current gen");
		System.out.println("Cell is alive: "+ng.isAlive(x,y));
		System.out.println("Nbours: "+ng.countNeighbours(x, y));
			
		System.out.println("\nNext gen:");
		System.out.println("Cell will be alive: "+ng.cellstatusNextgeneration(x, y));
		
		
//		System.out.println("\nCurrent board: "+gb.toString());
//		System.out.println("String: " + gb.toString());
		
	}

}
