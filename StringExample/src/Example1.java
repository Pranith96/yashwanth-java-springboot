
public class Example1 {

	public static void main(String[] args) {
		String s = "Hello";
		s = s.concat("World");
		System.out.println(s);

		String s1 = "Hi Welcome";
		
		int length = s1.length();
		System.out.println(length);
		
		String s2 = " ";
		int length1 = s2.length();
		System.out.println(length1);
		
		String s3 = " hello ";
		System.out.println(s3);
		s3 = s3.trim();
		System.out.println(s3);
		
		String s4 = "Hello";
		boolean result = s4.contains("e");
		System.out.println(result);
		
		boolean result1 = !s4.contains("elo");
		System.out.println(result1);
		
		char ch = s4.charAt(1);
		System.out.println(ch);
		
		boolean empty = s4.isEmpty();
		System.out.println(empty);
		boolean notempty = !s4.isEmpty();
		System.out.println(notempty);
		
		boolean blnk = s4.isBlank();
		System.out.println(blnk);
	}
}
