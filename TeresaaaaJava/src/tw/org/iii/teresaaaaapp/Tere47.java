package tw.org.iii.teresaaaaapp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Tere47 {

	public static void main(String[] args) {
		File source = new File("dir1/file1");
		try {
			FileInputStream fin = new FileInputStream("dir1/file1");
			int len; byte[] buf = new byte[(int)source.length()];
			fin.read(buf);
			System.out.println(new String(buf ));
			
			fin.close();
			//System.out.println("OK");
		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

}
