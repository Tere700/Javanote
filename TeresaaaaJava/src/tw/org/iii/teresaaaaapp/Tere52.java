package tw.org.iii.teresaaaaapp;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Tere52 {

	public static void main(String[] args) {
		try {
			FileReader reader = new FileReader("dir1/rx.csv");
			BufferedReader breader = new BufferedReader(reader);
			String line;
			while((line = breader.readLine())!=null) {
				String[]row = line.split(",");
				System.out.println(row[1]);
			}
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		

	}

}
