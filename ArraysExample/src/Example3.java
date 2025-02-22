public class Example3 {

	public static void main(String[] args) {
		int[] j = { 10, 11, 12, 13, 4, 5, 6, 7, 8, 33, 5, 7, 8, 9, 53, 4 };

		int key = 4;

		for (int i = 0; i < j.length; i++) {
			if (j[i] == key) {
				System.out.println(i);
			}
		}
	}
}
