import java.util.ArrayList;

public class bigram {
	  public static String[] findOcurrences(String text, String first, String second) {
	        
	        String[] arr = text.split("\\s+");
	        int l1 = 0,l2 = 1, l3=2;
	        ArrayList<String> s = new ArrayList<String>();
	        
	        System.out.println(first);
	        System.out.println(second);
	        System.out.println(text);
	        
	        while(l3<=arr.length){
	            if( (arr[l1].compareTo(first)==0) && (arr[l2].compareTo(second)==0)){
	                s.add(arr[l3++]);
	                l1++;
	                l2++;
	            }else{
	            	l1++;
	            	l2++;
	                l3++;
	            }
	            
	        }
	        
	        int i=0;
	        String[] soln = new String[s.size()];
	        for(String out : s){
	            System.out.println(out);
	            soln[i++] = out;
	        }
	        return soln;
	    }
}
