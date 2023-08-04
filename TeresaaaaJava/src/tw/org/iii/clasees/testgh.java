package tw.org.iii.clasees;

public class testgh {

	public static void main(String[] args) {
		String x = new String();
		x = "How dare you are!";
		System.out.println(x.indexOf("you"));
		System.out.println("-----------");
		System.out.println(x.indexOf(97));
		System.out.println("-----------");
		System.out.println(x.indexOf("e",8));
		System.out.println("-----------");
		System.out.println(x.indexOf(97,8));
		System.out.println("-----------");
		
		
		int c [][][]= new int [][][] {{{1,2,3},{4,5,6},{7,8,9}},{{7,8,9},{1,2,3},{4,5,6}}};
			System.out.println(c[1][1][2]);
	}

}
