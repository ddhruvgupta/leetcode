import java.util.LinkedList;
import java.util.Queue;

/**
 * 
 * @author coolm
 * Studying the pattern results in:
 * - interval = how many columns of full chars
 * - step = how many columns are in between full columns
 */

public class zigzag {
	
	
	 public static String convert(String s, int numRows) {
		  int len = s.length();
		  
		  if(numRows>len || numRows<=1) {
			  return s;
		  }
		  
		  char[] zigzag = new char[len];
		  int count = 0;
		  
		  int interval = (2*numRows) - 2;
	      
		  for (int i = 0; i<numRows; i++) {
			  int step = interval - 2* i;
			  for(int j = i ; j<len ; j+= interval) {
				  zigzag[count] = s.charAt(j);
				  count++;
				  if(step > 0 && step<interval && j+ step <len) {
					  zigzag[count] = s.charAt(j+step);
					  count++;
				  }
			  }
		  }
	        return new String(zigzag);
	    }
}
