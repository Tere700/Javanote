package tw.org.iii.clasees;

public class Bike extends Object { //類別的 只能有一個public-存取修飾字 一定要和bike一樣組類別
//沒有public 只有相同的package才能存取到 很少見
//Bike->物件->has-a 1.屬性 2.方法=> member <=private
//設計腳踏車
//存取範圍 大->小 public protested 沒寫 private
//protected=>字類別將父類別的功能進行Override覆寫
//所有的類別一定都有建構式
//如果開發者沒有定義建構式的話 在編譯時期 我們的編譯器 會幫你找到你的父類別
//編譯器幫忙 不等於繼承 一但有寫編譯器 就不會再幫你找父類別

	protected double speed;//型別是double ->物件變數 private只有這裡面才能存取到 速度這個屬性封裝起來
	public String owner;
	
	public Bike(String name) {
		System.out.println("");
	//建構式/子/方法 Constructor 沒有傳回值 一定要跟類別名稱一模一樣
	//屬性or狀態的初始化  繼承裡面不包含建構式  被繼承的只有member
	//無傳參數建構式
	public Bike(String name) {
		System.out.println("Bike(String)");
		owner= name;
	}
	
	public void upSpeed() {
		speed = speed < 1 ? 1 : speed*1.2;
	}
	public void downspeed() {
		speed = speed <1 ? 0: speed*0.5;
	}
	
	public double getSpeed() {
		return speed;
	}
	}