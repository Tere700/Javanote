package tw.org.iii.teresaaaaapp;

public class Tere09 {

	public static void main(String[] args) {
		
		int year=2023;
		
		if (year%4==0) {
			if (year%100==0) {
				if(year%400==0) {
					System.out.println("閏年") //366
			} else {System.out.println("平年")
				//365
			}
		} else {System.out.println("閏年")
			//365
		}
		}else {System.out.println("平年")
		//365
		}
		}
}
