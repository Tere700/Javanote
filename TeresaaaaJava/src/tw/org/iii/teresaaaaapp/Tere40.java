package tw.org.iii.teresaaaaapp;

public class Tere40 {

	public static void main(String[] args) {
		Bird b1 = new Bird();
		try {
			b1.setLeg(2);
		} catch (Exception e) {
			System.out.println();
		}

	}

}
class Bird{
	int leg;
	void setLeg(int n) throws Exception {
		if(n >= 0 && n <=2) {
			leg = n;
		}else {
			throw new Exception();
		}
	}
}