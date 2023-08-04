package tw.org.iii.clasees;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x =12345;
		
		if(x<0) {
			System.out.println("負數");
//        	return false;
        }
    	String str = Integer.toString(x);
        
        String reverse = new String(); 
        for(int j=str.length()-1;j>=0;j--) {
        reverse += str.substring(j,j+1);
        }
        System.out.println(reverse);
        
//        String original = new String(); 
//        for(int i=0;i<str.length();i++) {
//        original += str.substring(i);
//        
        
        
        if(str.equals(reverse)){
        	System.out.println("正確");
//        			return true;
        		
        	}
        }
	}


