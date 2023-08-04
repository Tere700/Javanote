package tw.org.iii.clasees;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Stack;

public class test3 {

	public static void main(String[] args) {

		String s = "{[]}";
		Stack<Character> valid = new Stack<>();

		for (int i = 0; i < s.length(); i++) {
			// System.out.println("POK");
			switch (s.charAt(i)) {
			case '(':
				valid.add('(');

				break;
			case '{':
				valid.add('{');

				break;
			case '[':
				valid.add('[');

				break;
			case ')':
				if (valid.empty() || valid.peek() != '(') {
					System.out.println("No");
				} else if (valid.peek() == '(') {
					valid.pop();
					System.out.println("Yes");
				}
				break;

			case '}':
				if (valid.empty() || valid.peek() != '{') {
					System.out.println("No1");
				} else if (valid.peek() == '{') {
					valid.pop();
					System.out.println("Yes1");
				}
				break;

			case ']':
				if (valid.empty() || valid.peek() != '[') {
					System.out.println("No3");
				} else if (valid.peek() == '[') {
					valid.pop();
					System.out.println("Yes3");
				}
				break;
			}
		}
	}

	class Solution {
		public boolean isValid(String s) {
			if (s.length() % 2 != 0) {
				return false;
			}
			Stack<Character> valid = new Stack<>();

			for (int i = 0; i < s.length(); i++) {

				switch (s.charAt(i)) {
				case '(':
					valid.add('(');

					break;
				case '{':
					valid.add('{');

					break;
				case '[':
					valid.add('[');

					break;
				case ')':
					if (valid.empty() || valid.peek() != '(') {
						return false;
					} else if (valid.peek() == '(') {
						valid.pop();
					}
					break;

				case '}':
					if (valid.empty() || valid.peek() != '{') {
						return false;
					} else if (valid.peek() == '{') {
						valid.pop();
					}
					break;
				case ']':
					if (valid.empty() || valid.peek() != '[') {
						return false;
					} else if (valid.peek() == '[') {
						valid.pop();
					}
					break;
				}
			}
			if (valid.empty()) {
				return true;
			} else {
				return false;
			}
		}
	}
}

//		String x ="()[]{}";
//		HashMap<Character,Character> hashmap = new HashMap<>();
//		hashmap.put('(',')');
//		hashmap.put('{','}');
//		hashmap.put('[',']');
//		for(int i = 0; i<x.length()-1;i++) {
//			if(x.charAt(i+1)==hashmap.get(x.charAt(i))) {
//					System.out.println(x.charAt(i+1));
//					System.out.println(hashmap.get(x.charAt(i)));
//					i=i+1;
//					
//			}				
//		}
//	}
//}
//class Solution {
//    public boolean isValid(String s) {
//    	HashMap<Character,Character> hashmap = new HashMap<>();
//		hashmap.put('(',')');
//		hashmap.put('{','}');
//		hashmap.put('[',']');
//		for(int i = 0; i<s.length()-2
//				;i++) {
//			if(s.charAt(i+1)==hashmap.get(s.charAt(i))) {
//					i=i+1;
//					return true;
//			}else if (s.charAt(i+2)==hashmap.get(s.charAt(i+1))) {
//				i=i+1;
//				return true;
//			}
//		}return false;
//	}		
//}
