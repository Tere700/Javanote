package tw.org.iii.teresaaaaapp;

import java.io.File;

public class Tere43 {

	public static void main(String[] args) {
		File dir1 = new File("d:/tere/dir");// \跳脫字元
		if (dir1.exists()) {
			System.out.println("OK");
		}else {
			System.out.println("XX");
		}
		File dir2 = new File("d:\\tere\\test");
		if (dir2.exists()) {
			System.out.println("OK");
		}else {
			System.out.println("XX");
			}
	}

}
