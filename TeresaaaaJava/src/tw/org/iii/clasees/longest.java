package tw.org.iii.clasees;

public class longest {

	public static void main(String[] args) {

		b2	bb= new b2();

	}
}
class b1 extends Object{
	b1(){
		System.out.println("b1");
	}
}
class b2 extends b1{
	b2(){
		//super()
	}
	b2(int a){
		
		System.out.println("b2");
		
	}

}
class b3 extends b2{
	b3(){
		super();
		System.out.println("b3");
	}

}