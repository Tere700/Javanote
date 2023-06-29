package tw.org.iii.teresaaaaapp;

public class Tere41 {
	public static void main(String[] args) {
		
	}
}
class Tere411{
	void m1() {
		m2();
	}
	void m2() {	
		m3(); 
	}
	void m3(int a) {
		if(a == 1 ) {
			throw new Exception();
		}
	}
}

