public class longestPalindrome {

	String test;
	String soln;
	
	public String checkPalin(String s) {
		//TODO: Input Validation
		if(s == null || s.length() < 1)
			System.out.println("");
		
		int start = 0, end = 0;
		for(int i=0;i<s.length();i++) {
			//Start from first char and expand outward to check if longer palindrome is possible
			
			int len1 = expand(s,i,i); //handle case for odd length Palindrome
			int len2 = expand(s,i,i+1); //handle case doe even length Palindrome
			
			int len = Math.max(len1,len2);
			if(len> end-start) {
				start = i-(len-1)/2;
				end = i+ len/2;
			}
		}
		
		return s.substring(start,end+1);
	}
	
	public int expand(String s, int Left, int Right) {
		 int L = Left, R = Right;
		    while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
		        L--;
		        R++;
		    }
		    return R - L - 1;
		
	}

	public longestPalindrome() {
		this.test = "babad";
		this.soln = checkPalin(test);
		System.out.println(this.soln);
	}
	
	public longestPalindrome(String s) {
			this.test = s;
			this.soln = checkPalin(test);
			System.out.println(this.soln);
	}
	
}


