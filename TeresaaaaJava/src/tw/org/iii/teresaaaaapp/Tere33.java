package tw.org.iii.teresaaaaapp;

public class Tere33 {

	public static void main(String[] args) {
		Car car1 = new Car();
		car1.m1();car1.m2();
		Car car2 = new FCar();
		car2.m1();car2.m2();
		FCar car3 = (FCar)car2;
		car3.m3();
		System.out.println(car2 == car3);	
		MCar car4 = new MCar();
		Car car5 = car4;
		
		
	}


class Car{ //關係只會發生在直系血親身上
	void m1() {
		System.out.println("Car:m1()");	
	}
	void m2() {
		System.out.println("m2()");	
	}
}
class FCar extends Car{ //跟MCar無關
	void m1() {
		System.out.println("FCar:m1()");}
	
	void m3() {
		System.out.println("FCar:m3()");
	}

	//關係只會發生在直系血親身上
	class MCar extends Car{
	void m1() {
		System.out.println("MCar:m1()");}
	
	void m3() {
		System.out.println("MCar:m3()");
	}
	
	}}}





