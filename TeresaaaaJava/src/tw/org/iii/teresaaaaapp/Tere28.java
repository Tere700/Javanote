package tw.org.iii.teresaaaaapp;

import tw.org.iii.clasees.TWId;

public class Tere28 {

	public static void main(String[] args) {
		System.out.println(Math.random());
		System.out.println(TWId.isRightId("abc"));
		String letters = "ABCDEFGHIJKLMNOPQRSTUVXWYZ";
		System.out.println(letters.indexOf('7'));
		
		String id ="A123456789";
		if(id.matches("[A-Z][12][0-9]{8}")){ //[a-zA-Z$_][a-zA-Z0-9$_]*
			System.out.println("OK"); //mail&密碼 正規表示法
			}else {
				System.out.println("XX");
			}
			 System.out.println("------");
			 if(TWId.isRightId("A123456789")) {
				 System.out.println("OK");
			 }else {
				 System.out.println("XX");
			 }
		

	}

}
