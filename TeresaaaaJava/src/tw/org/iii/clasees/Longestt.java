package tw.org.iii.clasees;

public class Longestt {

	public static void main(String[] args) {
		String[] a = { "circcr", "ciar", "circle" };
		String y = "";
		for (int x = 1; x < a.length; x++) {
			int n = Math.min(a[0].length(), a[x].length());
			StringBuffer sb = new StringBuffer();
			for (int i = 0; i < n; i++)
			{
				if (a[0].charAt(i) == a[x].charAt(i))
					sb.append(a[0].charAt(i));
				else
					break;
			}
			a[0] = sb.toString();
		}
		System.out.println(a[0]);
	}
}