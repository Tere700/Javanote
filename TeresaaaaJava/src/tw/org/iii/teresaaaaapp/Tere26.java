package tw.org.iii.teresaaaaapp;

import tw.org.iii.clasees.Bikw;

public class Tere26 {

	public static void main(String[] args) {
		Bikw b1 = new Bikw ("Tere26");//只要是new就不一樣, 物件印出記憶體的位置
		Bikw b2 = new Bikw ("Tere26");//字串佔很多空間
		Bikw b3 = b1;//相同物件有兩個名稱
		int[] a1 = new int [3];
		double[] a2 = new double [3];
		boolean[] a3 = new boolean [3];		
		float [] a4 = new float [3];
		
		
		
		System.out.println(b1); //印出記憶體的位置
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(a1);	
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
		
		System.out.println(b1 == b2);
		System.out.println(b1 == b3);
	}

}
