
public class Example3 {

	public static void main(String[] args) {
		int age = 30;
		if (age > 0 && age <= 5) { // 30
			System.out.println("Baby");
		} else if (age > 5 && age <= 12) {
			System.out.println("Kid");
		} else if (age > 12 && age <= 19) {
			System.out.println("Teenage");
		} else if (age > 19 && age <= 35) {
			System.out.println("Adult"); // Adult
		} else if (age > 35 && age <= 60) {
			System.out.println("Men");
		} else if (age > 60 && age <= 100) {
			System.out.println("Old");
		} else {
			System.out.println("Invalid");
		}
	}
}
