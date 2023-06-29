package tw.org.iii.clasees;

import java.io.Serializable;

public class Student implements Serializable{
	private int math, eng, ch;//基本型別偷偷轉成物件
	private String name;
	private Bikw bikw;
	
	public Student(int math, int eng, int ch, String name) {
		this.math = math; this.eng = eng; this.ch = ch;
		this.name = name;
		bikw = new Bikw(name);
	}
	public int sum() {return math+eng+ch;}  //基本型別
	public double avg() {return sum()/3.0;} //基本型別
	public String gatName() {return name;} //物件
}
