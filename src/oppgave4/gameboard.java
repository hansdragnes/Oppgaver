package oppgave4;

public class gameboard {

	int[][] table = 
			new int [][]	{{1,0,0},
		 					{1,0,1},
		 					{1,0,0}
							};

	public int[][] getTable() {
		return table;
	}

	public void setTable(int[][] table) {
		this.table = table;
	}
	
}
