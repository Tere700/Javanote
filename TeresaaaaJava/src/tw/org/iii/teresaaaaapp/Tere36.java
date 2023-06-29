package tw.org.iii.teresaaaaapp;

public class Tere36 {

	public static void main(String[] args) {
		// 方法中的文法有順序 邏輯
		Tere362 obj1 = new Tere362();
		Tere361 obj2 = new Tere362();
		Tere363 obj3 = new Tere362();
				
	}

} //介面也有發揚光大的精神
interface Tere361{ //介面/規格  永遠都是要實作 =>class 永遠public 規格沒有建構式 不會做出物件實體
	void m1();//宣告時同時初始化 介面裡面的所有方法全都是抽象 所以不用寫abstract
	int m2(String a);//傳回值 方法名稱(參數)
}
class Tere362 implements Tere361, Tere363{ //implements只能放在類別內
	public void m1() {} //visibility就是存取修飾字 //extends是發揚光大 存取修飾字要>=父類別
	public int m2(String a) {return 1;}
	public void m3() {}
	public int m4(String a) {return 1;}
}

interface Tere363 { //屬性 定義沒有順序性
	void m3(); //方法有順序性
	int m4(String a);
}
interface Tere364 extends Tere361, Tere363{ //interface的發揚光大可以是多個
	void m5();
}


//創造多型


