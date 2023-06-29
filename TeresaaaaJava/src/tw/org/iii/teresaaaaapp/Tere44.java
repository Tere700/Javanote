package tw.org.iii.teresaaaaapp;

import java.io.File;

public class Tere44 {

	public static void main(String[] args) {
		File here = new File("."); //本目錄，這是相對路徑不是絕對位置
		System.out.println(here.getAbsolutePath());
		File dir1 = new File("./dir3/dir4/dir5/dir6");//用相對路徑換電腦才找的到
		if (dir1.exists()) {
			System.out.println("OK");
		}else {
			System.out.println("XX");
			dir1.mkdirs();
		}
	}

}
