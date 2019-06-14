import java.util.*;

public class longestSubstring {
	public static int lengthOfLongestSubstring(String s) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		int[] foo = new int[20];
		System.out.println(foo.length);
		
		int n = s.length();
		Set<Character> map = new HashSet<Character>();
		int i = 0, j = 0, len = 0;
		if(map.contains(s.charAt(i))) {
			map.remove(s.charAt(j++));
		}else {
			map.add(s.charAt(i++));
			len = Math.max(len, j-1);
		}
		return len;
		
		
    }
	
}
