
public class reverseInt {

	
	public static int reverse2(int i) {
		
		if(i>Integer.MAX_VALUE || i<=Integer.MIN_VALUE)
			return 0;
		
		String num = new String();
		String out = new String();
		
		num = Integer.toString(Math.abs(i));
		for(int a = num.length()-1 ; a>=0 ; a--) {
			out = out+num.charAt(a);
		}
		
		double soln = Double.parseDouble(out);
		if(soln>Integer.MAX_VALUE || soln<Integer.MIN_VALUE)
			return 0;
		else {
			if(i<0)
				return (int)-soln;
			else
				return (int)soln;
		}
		

	}
	
	public static int reverse(int x) {
		int rev = 0;
		while(x!=0) {
			int pop = x%10;
			x=x/10;
			if(rev> Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE/10 && pop >7) ) {return 0;}
			if(rev< Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE/10 && pop <-8) ) {return 0;}
			rev = rev*10+pop;			
		}
		return rev;
	}
	
	public static void test(int i) {
		System.out.println(reverse(i));
	}
	
	public static void test() {
		int i = 2001;
		System.out.println(reverse(i));
	}
	
}
