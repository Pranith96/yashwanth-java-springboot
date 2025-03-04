
public class Example3 {

	public static void main(String[] args) {
		String s = "Hello World 123";

		String str = s.substring(1);
		System.out.println(str);

		String str1 = s.substring(0, 6);
		System.out.println(str1);

		String str2 = s.substring(6, 11);
		System.out.println(str2);

		String str3 = s.substring(s.length() - 3, s.length());
		System.out.println(str3);
	}
}
