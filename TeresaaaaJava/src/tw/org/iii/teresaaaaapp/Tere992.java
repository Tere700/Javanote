package tw.org.iii.teresaaaaapp;

public class Tere992 {

	public static void main(String[] args) {
		final int START = 3;
		final int ROWS = 3;
		final int COLS = 4;
		for(int h=0; h<ROWS; h++) {
			for(int k= 1; k<=9;k++) {
				for(int i = START ; i <= (START+COLS-1); i++) {//所以這裡要再減起始值回來才會是四列
					int newi = i + h * COLS;//COLS在這兒兒兒兒 COLS往下跳四列的話就是起始值+4
					int r = newi * k;
					
						System.out.printf("%d x %d = %d\t", newi , k , r);
		
				}System.out.println();
				} System.out.println("--------");}}}
