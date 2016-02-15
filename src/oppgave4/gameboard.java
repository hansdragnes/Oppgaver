package oppgave4;

import java.util.Arrays;

/**
 * Test class. Provides a default table and possibility to set and get the table.
 * @author hd
 *
 */
public class gameboard {

	int[][] table = 
			new int [][]	{{0,0,0,1},
							 {1,0,0,1},
		 					 {1,0,0,0},
		 					 {1,0,0,0}
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
