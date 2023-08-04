package tw.org.iii.clasees;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x =12345;
		int temp =0;
		if(x<0) {
			System.out.println("false");
		}
		while(x>0) {
			temp=x%10;
			x=x/10;
//			System.out.printf("%d",temp);
			System.out.println("------");
			temp*=((int)Math.pow(10,4));
			System.out.println(temp);
		}
	}
	}

  