
public class Example {

	public void display() {
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}
	}

	public void display1() {
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}

	public void display2() {
		int i = 0;
		while (i > 5) {
			// logic
			System.out.println(i);
			i++;
		}
	}

	public void display3() {
		int i = 0;

		do {
			// logic
			System.out.println(i);
			i++;
		} while (i > 5);
	}
}
