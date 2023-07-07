package tw.org.iii.teresaaaaapp;

import tw.org.iii.clasees.BCrypt;

public class Tere69 {

	public static void main(String[] args) {
		String passwd = "123456";
		String hashPasswd = BCrypt.hashpw(passwd, BCrypt.gensalt());
		System.out.println(hashPasswd);
		
		String passwd2 = "7777";
		if (BCrypt.checkpw(passwd2, hashPasswd)) {
			System.out.println("OK");
		}else {
			System.out.println("XX");
		}
		
	}

}
