
public class MainClass {

	public static void main(String[] args) {
		Example1 ex1 = new Example1();
		ex1.display();
		int i = 10;
		int j = 20;
		int k = 30;
		ex1.displayWithParams(i, j, k);
		String s = "Helo world";
		ex1.displayWithParams1(20, 30, s);

		System.out.println("..............Static.............");

		Example2.display_3();
		Example2.displayWithParams_4(i, j, k);
		Example2.displayWithParams1_5(i, j, "Java");
	}
}
