package tw.org.iii.teresaaaaapp;

public class Tere02 {

	public static void main(String[] args) {
		// 語言特性
		byte var1=12;
		byte var2=13;
		long var3=var2+1;
		System.out.println(var3);
		byte var21=(byte)(var1+var2);
		System.out.println(var21);
		byte a=127;
		a+=1; //a++;
		System.out.println(a);
		
		
	/*型別不同 塞不進去
	 *(byte,short,int)混合進行數學(+-/*)運算會轉換成int
	 * 但搭配long全不就會變成long
	 * 強制轉型有可能會喪失其精確度
	 * a += 1;位元的運算
	 * a++;
	 */

	}

}
