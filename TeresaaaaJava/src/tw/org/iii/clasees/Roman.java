package tw.org.iii.clasees;

import java.util.HashMap;
import java.util.LinkedHashMap;

import com.sun.jdi.Value;

public class Roman {
	public static void main(String[] args) {
		
		String x = new String();
		x="MCMXCIV";
		int y = 0;
		int temp = 0;
		
		HashMap<Character, Integer> hashmap = new LinkedHashMap<>();
		hashmap.put('I',1);
		hashmap.put('V',5);
		hashmap.put('X',10);
		hashmap.put('L',50);
		hashmap.put('C',100);
		hashmap.put('D',500);
		hashmap.put('M',1000);

		for(int i=0; i<x.length()-1;i++) {
			if(hashmap.get(x.charAt(i))<hashmap.get(x.charAt(i+1))) {
				y = hashmap.get(x.charAt(i+1))-hashmap.get(x.charAt(i)); 
				i++;
			}else {
				y = hashmap.get(x.charAt(i));
			} System.out.println(y);
			temp = temp +y;

		} temp = temp +hashmap.get(x.charAt(x.length()-1));
		System.out.println(temp);
	}
}
//1804
//1805