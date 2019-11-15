import java.util.Arrays;

public class shortestSubarray {
	public int shortestsubarray(int[] A, int K) {
        Arrays.sort(A);
        
        int right = A.length / 2 +1;
        int left = A.length;
        
        int sum = 0; 
        while(right < A.length && left >=0 && sum != K) {
        	sum = 0;
        	for (int i = left ; i <= right ; i++)
        		sum = sum + A[i];
        	
        
        	if (sum != K) {
        		int diff = K - sum;
        		if (diff < 0 && )
        	}
        	
        }
        
		return left;
               
        
    }
}
