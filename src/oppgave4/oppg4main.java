package oppgave4;

public class oppg4main {

	public static void main(String[] args) {
		
		gameboard gb = new gameboard();
		nextGeneration ng = new nextGeneration(gb);
		
		boolean currentCell = false;
		boolean alive = false;
		
		if (ng.isAlive(1, 1))	{
			System.out.println("Current gen:");
			System.out.println("Currentcell is alive: "+currentCell);
			System.out.println("Nbours: "+ng.countNeighbours());
			System.out.println("Will be alive next gen: "+ng.staysAlive());
		}
		
		else	{
			System.out.println("\nWas not alive\n Next gen:\n");
			if (ng.born())
				System.out.println("Turns to life"+" ( "+ng.countNeighbours()+" naboer)");
			else
				System.out.println("Stays dead"+" ( "+ng.countNeighbours()+" naboer)");
		}
		
	}

}
