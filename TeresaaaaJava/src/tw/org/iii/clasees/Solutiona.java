package tw.org.iii.clasees;
	class Solutiona {
	    public boolean isPalindrome(int x) {
	    	x=-10;
	    	for(int i=0; i < Integer.toString(x).length(); i++){
	    		if((x/(int)Math.pow(10, i))%10 ==(x/(int)Math.pow(10, (Integer.toString(x).length()-(i+1)))%10)) {
	    			return true;
	    		}
	    	}
	    	
			return false;
	    	
}
}