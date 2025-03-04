
public class Example2 {

	public static void main(String[] args) {
		String s = "@Hello World &123 Welcome %456";
		String str = s.replaceAll("[^a-z]", "");
		System.out.println(str);
		
		String str1 = s.replaceAll("[^A-Z]", "");
		System.out.println(str1);
		
		String str2 = s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(str2);
	}
}
