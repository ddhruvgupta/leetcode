

public class minPath {

	public static int minPathSum(int[][] grid) {
		int m = grid.length; // number of rows
		int n = grid[0].length; // # of cols

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				updateVal(grid, i, j);

			}

		}

		return grid[m - 1][n - 1];

	}

	private static void updateVal(int[][] grid, int row, int col) {
		// TODO Auto-generated method stub
		if (row == 0 && col == 0)
			return;

		if (row == 0) {
			int sum = grid[row][col] + grid[row][col - 1];
			grid[row][col] = sum;
			return;
		}

		if (col == 0) {
			int sum = grid[row][col] + grid[row - 1][col];
			grid[row][col] = sum;
			return;
		}

		int sum = grid[row][col] + Math.min(grid[row][col - 1], grid[row - 1][col]);
		grid[row][col] = sum;
		return;

	}

	public static int[][] arrayClone(int[][] src) {

		int[][] dup = new int[src.length][src[0].length];

		for (int i = 0; i < src[0].length; i++) {
			System.arraycopy(src[i], 0, dup[i], 0, src[i].length);
		}
		return dup;
	}
	
	public static int test() {
		int[][] grid = {
				{1,3,1},
				{1,5,1}
				};
		
		int shortest_path = minPath.minPathSum(grid);
		System.out.println(shortest_path);
		return shortest_path;
	}
	
	public static int test(int grid[][]) {
	
		/*
		 * 		int[][] grid = {
				{1,3,1},
				{1,5,1},
				{4,2,1}
			};
		 */
		
		int shortest_path = minPath.minPathSum(grid);
		System.out.println(shortest_path);
		return shortest_path;
	}
}
