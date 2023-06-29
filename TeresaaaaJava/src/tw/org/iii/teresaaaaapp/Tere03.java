package tw.org.iii.teresaaaaapp;

import java.util.Scanner;

public class Tere03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("x = ");
		int x = scanner.nextInt();
		System.out.print("y = ");
		int y = scanner.nextInt();
		int r1 = x + y;
		int r2 = x - y;
		int r3 = x * y;
		int r4 = x / y;
		int r5 = x % y; //取餘數
		//x+y=r
		//10+3=13
		//System.out.println(r);
		System.out.printf("相加結果:"+ "%d+%d=%d\n",x,y,r1);
		System.out.printf("%d-%d=%d\n",x,y,r2);
		System.out.printf("%d*%d=%d\n",x,y,r3);
		System.out.printf("%d/%d=%d...%d\n",x,y,r4,r5);
		/* ALT+/ command+/
		 * 自己打會少import
		 * 除了java.lang都要import或是完整的代出名稱
		 * printf f=format
		 */
	}

}
