package tw.org.iii.teresaaaaapp;

public class Tere07 {

	public static void main(String[] args) {
		
		double temp = Math.random(); // random從0.0~1.0中 隨機亂取一個double的數
		int score = (int)(temp*101) ; // 強制轉型 去小數點 101=0~100個值 +1位移1=1~101
		System.out.println(score);
			
		if (score>=90) {				//Ctrl+shift+F-->縮排布林值的運算
			System.out.println("A");
		}else if (score>=80) {
			System.out.println("B");
		}else if (score>=70) {
			System.out.println("C");
		}else if (score>=60) {
			System.out.println("D");
		}else {
			System.out.println("E");		
	}
	}
		
//		int score = 78;
//		if (score >=60) {
//			System.out.println("Pass");
//		} else {
//			System.out.println("Down");
//		}
//		System.out.println("Game Over");   
		//***Ctrl+/ 快速註解
	}


