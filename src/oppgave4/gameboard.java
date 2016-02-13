package oppgave4;

import java.util.Arrays;

public class gameboard {

	int[][] table = 
			new int [][]	{{0,0,0},
		 					{1,1,1},
		 					{1,1,0}
							};

	public int[][] getTable() {
		return table;
	}

	public void setTable(int[][] table) {
		this.table = table;
	}

	@Override
	public String toString() {
		String o="";
		for (int i=0;i<table.length;i++)
			for (int j=0;j<table[i].length;j++)
				o+=table[i][j];
		return o;
	}
	
	
	
}
