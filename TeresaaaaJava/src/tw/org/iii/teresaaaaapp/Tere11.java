package tw.org.iii.teresaaaaapp;

public class Tere11 {

	public static void main(String[] args) {
		int month= (int)(Math.random()*12)+1; 
		int days;
		switch (month) {
		case 1,3,5,7,8,10,12:
			days=31;
			break;
		case 4,6,9,11:
			days=30;
			break;	
		case 2:
			days=28;
			break;
		default:
			days=0;
			System.out.println("X");
			break;

	}
		System.out.printf("%d月有%d天",month, days);}
	}
//		int a=100;
//		final int b=10;//直接給值 最終
//		switch (a) { //byte, short, int, char, string
//		case 1:  //case被比對 不能是變數 要是常數 only Java不可以 其他程式可以
//			System.out.println("A");
//			break;
//		case 10:
//			System.out.println("B");
//		case 50:
//			System.out.println("C");
//			break; //遇到break才會跳出來 不然會一直print
//		case 100:
//			System.out.println("C");
//		default:
//			System.out.println("X");
//			break; //遇到break才會跳出來 不然會一直print
//	}
//		System.out.println("Game Over");
//	}
	
// }//break會脫離他所在的大括號=程式區塊(code block)