package tw.org.iii.teresaaaaapp;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

import tw.org.iii.clasees.Student;
        //把Outputstream還原回來 解序列化=>還原物件  比較java 跟其他比較不會相容
public class Tere54 {

	public static void main(String[] args) {
		try {
			ObjectInputStream oin = new ObjectInputStream(
					new FileInputStream("dir1/student.s1"));
			Object obj = oin.readObject();
			if(obj instanceof Student) {
				System.out.println("OK");
			}
			Student s1 = (Student) obj;
			System.out.println(s1.gatName());
			System.out.println(s1.sum());			
			System.out.println(s1.avg());
			oin.close();
		}catch(Exception e) {
			
		}
	}

}
