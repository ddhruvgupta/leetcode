import java.util.Arrays;

public class minPath {
    public static int minPathSum(int[][] grid) {
		int m = grid.length; // number of rows
		int n = grid[0].length; //# of cols
    	
		int row = 0, col = 1;
		
		int[][] path = new int[m][n];
		path = arrayClone(grid);
		
		
		while(row<m) {
			
			while(col<n) {
			path[row][col]= path[row][col] + preceding_node(grid,row,col);
			System.out.println(Arrays.toString(path[row]));
			col++;
			}
			col = 0;
			row++;
		}
		
    	return path[m-1][n-1];
        
    }

	private static int preceding_node(int[][] grid, int row, int col) {
		// TODO Auto-generated method stub
		
		int prev_row = row;
		int prev_col = col;
		
		if(row>0 && col>0) {
			prev_row = row-1;
			prev_col = col-1;
			int val = Math.min(grid[prev_row][col], grid[row][prev_col]);
			System.out.println(row+"-"+col+"-"+val);
			return val;
		}
			
		if(row>0) {
			prev_row = row-1;
			int val = grid[prev_row][col];
			System.out.println(row+"-"+col+"-"+val);
			return val;	
		}
			
		if(col>0) {
			prev_col = col-1;
			int val = grid[row][prev_col];
			System.out.println(row+"-"+col+"-"+val);
			return val;
		}
			
		return 0;

	}
	
	public static int[][] arrayClone(int[][] src){
		
		int[][] dup = new int[src.length][src[0].length];
		
		for(int i = 0 ; i <src[0].length; i++) {
			System.arraycopy(src[i], 0, dup[i], 0, src[i].length);
		}
		return dup;
	}
}
