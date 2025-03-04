
public class Example {

	public static void main(String[] args) {
		String s = "Hello";
		String s1 = "Hello";

		String s2 = new String("Hello");
		String s3 = new String("Hello");
		String s4 = new String("HelLO");

		if (s == s1) {
			System.out.println("TRUE.....1");
		}

		if (s2 == s3) {
			System.out.println("TRUE......2");
		}

		if (s == s3) {
			System.out.println("TRUE......3");
		}

		if (s.equals(s1)) {
			System.out.println("TRUE.....4");
		}

		if (s2.equals(s3)) {
			System.out.println("TRUE......5");
		}

		if (s.equals(s3)) {
			System.out.println("TRUE......6");
		}

		if (s.equals(s4)) {
			System.out.println("TRUE......7");
		}

		if (s.equalsIgnoreCase(s4)) {
			System.out.println("TRUE......8");
		}
	}
}
