package tw.org.iii.teresaaaaapp;

public class Tere12 {

	public static void main(String[] args) {
		int[]a; //byte,short,int,long,float,double,boolean,char
		a=new int [3]; //[int>0]
		boolean[]b=new boolean[4];
		System.out.println(a.length);
		System.out.println(b.length);
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(b[0]);
		a[1]=123;
		a[0]=76;
		for (int i=0; i< a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.println("----");//for-each跑全部元素
		for (int v:a) { //v是變數
			System.out.println(v);
		}
	}

}
