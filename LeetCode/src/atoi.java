import java.util.Arrays;

public class atoi {
	
	
	
	public static int test(String str) {
		 // Create dummy string and convert input to new num string using REGEX
        String[] num = str.trim().split("\\s+");
        String val = num[0].replaceAll("[^-+?\\d+(\\.\\d+)?]","");
        
        
        
        System.out.println(val);
        
        return 0;
	}
	
}
