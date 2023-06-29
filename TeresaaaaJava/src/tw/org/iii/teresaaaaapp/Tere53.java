package tw.org.iii.teresaaaaapp;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import tw.org.iii.clasees.Student;

public class Tere53 {

	public static void main(String[] args) {
		Student s1 = new Student(45, 32, 56, "Brad");
		System.out.println(s1.gatName());
		System.out.println(s1.sum());
		System.out.println(s1.avg());
		
		try (FileOutputStream fout = new FileOutputStream("dir1/student.s1");//可自動關閉的語法try...}
				ObjectOutputStream oout = new ObjectOutputStream(fout);) {
			oout.writeObject(s1);
			oout.flush();
		} catch (Exception e) {
			System.out.println(e);
		}
				
	}

}
