import java.util.Arrays;

public class atoi {
	
	
	
	public static int test(String str) {
		 // Create dummy string and convert input to new num string using REGEX
		int right = 0;
		int left = 0;
		
		String[] num = str.trim().split("\\s+");//removes starting spaces 
		System.out.println(Arrays.deepToString(num));

		char[] a = num[0].toCharArray();
        System.out.println(Arrays.toString(a));
        if(a.length==0)
        	return 0;
		
		int sign = 0;
		
		if(a[0]=='-') {
			sign = -1;
			left++;
			right++;
		}else if(a[0]=='+') {
			sign = 1;
			left++;
			right++;
			}else {
				sign = 1;
			}
		
		System.out.println(sign);
		
        for(int i = left; i< a.length ; i++) {
        	if(Character.isDigit(a[i])) {
        		right++;
        	}else
        		break;
        }
        
//        if(right==left) {
//        	return 0;
//        }

        
        try {
        	int val = Integer.parseInt(num[0].substring(left, right));
            return val*sign;
		} catch (Exception e) {
			if (sign == -1)
				return -2147483648;
			else
				return 2147483647;
		}
	}
	
}
