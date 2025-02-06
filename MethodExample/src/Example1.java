
public class Example1 {

	// Non static method without parameters and without return type
	public void display() {
		System.out.println("display1 ");
	}

	// Non static method with parameters and without return type
	public void displayWithParams(int num1, int num2, int num3) {

		int a = num1 + num2;
		int result = a * num3;
		System.out.println(result);
	}

	// Non static method with parameters and without return type
	public void displayWithParams1(int num1, long num2, String word) {
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(word);
	}
}
