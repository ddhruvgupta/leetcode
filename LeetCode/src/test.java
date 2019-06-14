import java.util.Arrays;

public class test {

	public static void main(String[] args) {
		
		int[][] grid = {{1,3,1},{1,5,1},{4,2,1}};
		int shortest_path = minPath.minPathSum(grid);
		System.out.println(shortest_path);
	}
}