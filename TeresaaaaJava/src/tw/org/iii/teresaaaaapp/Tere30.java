package tw.org.iii.teresaaaaapp;

import tw.org.iii.clasees.TWId;

public class Tere30 {

	public static void main(String[] args) {
		TWId id1 = new TWId();
		TWId id2 = new TWId(false);
		TWId id3 = new TWId(5); //F
		TWId id4 = new TWId(true,1);
		System.out.println(id1.getId());
		System.out.println(id2.getId());
		System.out.println(id3.getId());
		System.out.println(id4.getId());

	}

}
