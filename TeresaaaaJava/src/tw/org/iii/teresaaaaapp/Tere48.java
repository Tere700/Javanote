package tw.org.iii.teresaaaaapp;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Tere48 {

	public static void main(String[] args) {
		try {
			String mesg = "\n456";
			for (int i=1; i<10; i++);
			FileOutputStream fout = new FileOutputStream("dir1/file3",true);
			fout.write(mesg.getBytes());
			fout.flush();
			fout.close();
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		

	}

}
