
public class Example {

	int q = 100; // instance variable
	static int h = 300; // static variable

	// static method
	public static void main(String[] args) {
		System.out.println("welcome");
		Example ex = new Example(); // Object
		ex.hello();

		System.out.println(ex.q); // 90
		System.out.println(h);
		hi();
	}

	// non-static method without parameters
	public void hello() {
		int i = 10; // local variable
		int j = 20;
		int k = i + j;
		System.out.println(k);

		display(i, j);
		
		System.out.println(q);
		System.out.println(h);
		
		q = 90;
	}

	// non-static method with parameters
	public void display(int value1, int value2) {
		int a = value1 * value2;
		System.out.println(a);
	}

	// static
	public static void hi() {
		System.out.println("hi");
	}
}
