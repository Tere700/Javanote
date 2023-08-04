package tw.org.iii.clasees;

public class Solution {
	 public boolean isPalindrome(int x) {
		 	if(x<0) {
	        	return false;
	        }
	    	String str = Integer.toString(x);
	        
	        String reverse = new String(); 
	        for(int j=str.length()-1;j>=0;j--) {
	        reverse += str.substring(j,j+1);
	        }
	        
	        if(str.equals(reverse)){
	        			return true;
	        		
	        	}
	        return false;
	        }
	    }