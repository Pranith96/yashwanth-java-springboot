import java.util.Arrays;

public class Example {

	public static void main(String[] args) {
		int i = 10;
		int[] j = { 10, 11, 12, 13, 4, 5, 6, 7, 8, 33, 5, 7, 8, 9, 53, 4 };
		String[] s = { "ABC", "XYZ", "LKD" };
		boolean[] b = { true, false, true, true };

		System.out.println(Arrays.toString(j));
		System.out.println(Arrays.toString(s));

		int size = j.length;
		System.out.println("size: " + size);

		int firstIndex = j[0];
		System.out.println(firstIndex);
		int secondIndex = j[1];
		System.out.println(secondIndex);

		int lastIndex = j[j.length - 1];
		System.out.println(lastIndex);

		int lastSecondIndex = j[j.length - 2];
		System.out.println(lastSecondIndex);
		System.out.println("..................");
		for (int k = 0; k < j.length - 1; k++) {
			int value = j[k];
			System.out.println(value);
		}
		System.out.println("......even positions............");
		for (int k = 0; k < j.length - 1; k++) {
			if (k % 2 == 0) {
				int value = j[k];
				System.out.println(value);
			}
		}

		System.out.println("......even numbers............");
		for (int k = 0; k < j.length - 1; k++) {
			if (j[k] % 2 == 0) {
				int value = j[k];
				System.out.println(value);
			}
		}
	}
}
