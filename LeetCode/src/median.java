import java.util.ArrayList;

public class median {
	  public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
	        int l1=0, l2=0;
	        
	        ArrayList<Integer> list = new ArrayList<Integer>();
	        
	        // Arrays.sort(nums1);
	        // Arrays.sort(nums2);
	        
	        
	        while(l1<nums1.length && l2<nums2.length) {
	            if(nums1[l1]>=nums2[l2])
	                list.add(nums2[l2++]);
	            else
	                list.add(nums1[l1++]);
	        }
	        
	        while(l1<nums1.length){
	            list.add(nums1[l1++]);
	                
	        }
	        
	        
	        while(l2<nums2.length){
	            list.add(nums2[l2++]);
	                
	        }        
	        
	        return med(list);
	    }
	    
	    public static double med(ArrayList<Integer> list){
	    	
	   
	    	
	    	
	    	
	    	
	    	
	        int len = list.size();
	        double median =0;
	        
	        if(len%2==0){
	            Double a = Double.valueOf(list.get(len/2 - 1));
	            Double b = Double.valueOf(list.get(len/2 ));
	            median = (a+b)/2;
	            
	        }else{
	            if(len==1)
	                len=2;
	            Double a = Double.valueOf(list.get(len/2 ));
	            median = a;
	        }
	            
	        
	        return median;
	        
	    }
}
