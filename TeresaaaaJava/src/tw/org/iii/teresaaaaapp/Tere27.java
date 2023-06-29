package tw.org.iii.teresaaaaapp;

import tw.org.iii.clasees.Scooter;

public class Tere27 {

	public static void main(String[] args) {
		Object obj = new Object();
		String s1 = new String("Tere"); //印出記憶體位置
		String s2 = new String("Tere");
		System.out.println(obj);		
		System.out.println(s1);
		
		Scooter s3 = new Scooter();
		System.out.println(s3);
		System.out.println("-----");
		System.out.println(s1 == s2);//比位置
		System.out.println(s1.equals(s2));//比產生出的字

	}

}
