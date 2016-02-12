package oppgave4;

public class oppg4main {

	public static void main(String[] args) {
		
		int[][] tabell = 
				new int [][]	{{1,1,1},
			 					{0,1,1},
			 					{0,0,1}
								};
		
		rules c = new rules();
		int neighbours = c.countNeighbours(tabell);
		boolean survives = c.staysAlive(neighbours);
		
		
		System.out.println("Lever: "+survives +" , antall naboer: "+ neighbours);
	}

}
