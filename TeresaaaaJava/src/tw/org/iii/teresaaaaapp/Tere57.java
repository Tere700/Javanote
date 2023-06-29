package tw.org.iii.teresaaaaapp;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Tere57 {

	public static void main(String[] args) {
		Set<Integer> lottery = new TreeSet<>(); //TreeSet有排序
		while (lottery.size()<6) {
			lottery.add((int)(Math.random()*49+1));
		}
		System.out.println(lottery);
		for(Integer v: lottery) {
			System.out.println(v);
		}
	}

}
