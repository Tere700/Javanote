package tw.org.iii.teresaaaaapp;

public class Tere14 {

	public static void main(String[] args) {
		final int START=1;
		final int ROWS=2;
		final int COLS=3;
		for (int j=1;j<=3;j++ ) {	System.out.println("b");
		for (int k=0;k<ROWS;k++) {
			System.out.println("a");
		
		
			for(int i=START; i<=(START+COLS-1); i++) { //起始值|幾個直行|
				System.out.println("c");
				int newi = i+k*COLS;
				int r=newi*j;
		//System.out.printf("%d X %d = %d\t",newi,j,r);

				}	
			System.out.println();
			} 
		}
	}
}

//陣列Array