
public class mostWater {
    private static int maxArea(int[] height) {
    	
    	int left = 0, right = height.length-1;
		int maxarea = 0;
    	while(left<right) {
			maxarea = Math.max(maxarea, Math.min(height[left],height[right])*(right-left));
			if(height[right]<=height[left])
				right--;
			else
				left++;
		}
    	System.out.println(maxarea);
    	return maxarea;
        
    }
    
    public static void test() {
    	int[] a = {1,8,6,2,5,4,8,3,7};
    	maxArea(a);
    }
}
