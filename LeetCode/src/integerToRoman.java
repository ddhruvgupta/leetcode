
public class integerToRoman {
    public static String intToRoman(int num) {
        
    	 int numbers[] = {1,4,5,9,10,40,50,90,100,400,500,900,1000}; 
    	    String sym[] = {"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"}; 
    	    
//    	    StringBuilder sb = new StringBuilder();
    	    String sb = "";
    	    int i=12;
    	    
    	    while(num>0)
    	    {
    	        int div = num / numbers[i];
    	        num %= numbers[i];
    	        for(;div-->0;) sb = sb + sym[i];
    	        i--;
    	    }
    	    sb = sym[0].substring(2).toLowerCase();
   
    	    return sb;
    	
        
    }
}
