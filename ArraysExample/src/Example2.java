import java.util.Arrays;

public class Example2 {

	public static void main(String[] args) {
		int[] j = { 10, 11, 12, 13, 4, 5, 6, 7, 8, 33, 3, 5, 7, 8, 9, 53, 4 };

		System.out.println(Arrays.toString(j));

		Arrays.sort(j);
		System.out.println(Arrays.toString(j));

		for (int i = j.length - 1; i >= 0; i--) {
			System.out.println(j[i]);
		}
	}
}
