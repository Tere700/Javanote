package tw.org.iii.teresaaaaapp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Tere46 {

	public static void main(String[] args) {
		try {
			FileInputStream fin = new FileInputStream("dir1/file1");
//			int c1 = fin.read();
//			System.out.println((char)c1);
//			int c2 = fin.read();
//			System.out.println((char)c2);
			
			int c;
			while((c = fin.read())!=-1) {
				System.out.print((char)c);
			}
			
			fin.close();
			//System.out.println("OK");
		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

}
