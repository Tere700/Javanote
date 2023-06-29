package tw.org.iii.teresaaaaapp;

import java.util.LinkedList;

public class Tere58 {
//可以重複 有順序性
	public static void main(String[] args) {
		LinkedList<String> names = new LinkedList<>();
		names.add(0,"Brad");
		names.add(0,"Eric");//add後才有空間 無法直接跳到3,
		names.add(0,"Peter");
		names.add(0,"Amy");
		names.add(0,"Brad");
		System.out.println(names.size());
		for(String name:names) {
			System.out.println(name);
		}
	}

}
