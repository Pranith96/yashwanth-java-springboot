
public class Example2 {

	public void display() {
		for (int i = 0; i < 3; i++) { // 0, 1, 2 // rows
			// System.out.println("i value: "+i);
			for (int j = 0; j < 3; j++) { // 0,1,2,3,4 // columns
				// System.out.println("j value: " + j);
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

	public void display1() {
		for (int i = 0; i < 4; i++) { // rows
			for (int j = i; j < 4; j++) { // columns
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public void display2() {
		for (int i = 0; i < 4; i++) { // rows
			for (int j = 0; j <= i; j++) { // columns
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
