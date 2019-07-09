import java.util.ArrayList;

public class intPalin {
    public static boolean isPalindrome(int x) {
        String num = Integer.toString(x);
        boolean flag = false;
        int left = 0, right = num.length()-1;

        
        while(left!=right) {
        	if(num.charAt(left)==num.charAt(right)) {
        		left++;
        		if(left!=right)
        			right--; 
        		flag = true;
        	}else { 
        		flag = false;
        		break;
        	}
        }
    	
    	return flag;
    }
    
    public static boolean isPalindrome_int(int x) {
		if(x<=0)
			return false;
		
		ArrayList<Integer> ch = new ArrayList<Integer>();
		
		
		while(x>0) {
			int num = x%10;
			x/=10;
			ch.add(num);
		}
    	
		int right = ch.size()-1;
		int left = 0;
		boolean flag = true;
		
        while(left!=right ) {
        	if(ch.get(left)==ch.get(right)) {
        		left++;
        		if(left!=right)
        			right--; 
        		flag = true;
        	}else { 
        		flag = false;
        		break;
        	}
        }
		
        System.out.println(flag);
    	return flag;
    	
    }
    
    public static void test() {
    	int i = -121;
    	System.out.println("Should be True: 121 "+ isPalindrome(121));
    	System.out.println("Should be False: -121 "+ isPalindrome(i));
    	System.out.println("Should be False: 10 "+ isPalindrome(11));
    	
    	isPalindrome_int(0);
    }
}
