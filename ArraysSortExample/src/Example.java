import java.util.Arrays;

public class Example {

	// find 2nd largest array element with inbuilt sorting method
	public void problem1() {
		int a[] = { 5, 3, 4, 2, 6, 8, 4, 5, 8, 9, 9, 0, 1 };
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));

		int largestElement = a[a.length - 1];
		System.out.println(largestElement);

		if (largestElement != a[a.length - 2]) {
			int secondLargestElement = a[a.length - 2];
			System.out.println(secondLargestElement);
		}
		int secondLargestElement = a[a.length - 3];
		System.out.println(secondLargestElement);
	}

	// find 2nd largest array element without inbuilt sorting method
	// sorting of Array
	public void problem2() {
		int a[] = { 5, 3, 4, 2, 6, 8, 4, 5, 8, 9, 0, 1 };
		int tmp = 0;// 3

		// time complexity - O(n2)
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					tmp = a[j];// 3
					a[j] = a[i]; // 5
					a[i] = tmp;// 3
				}
			}
		}
		System.out.println(Arrays.toString(a));

		int largestElement = a[a.length - 1];
		System.out.println(largestElement);

		int secondLargestElement = a[a.length - 2];
		System.out.println(secondLargestElement);
	}

	// find 2nd largest array element without sorting
	public void problem3() {
		int a[] = { 5, 3, 4, 2, 6, 8, 4, 5, 8, 9, 9, 0, 1 };
		int max = a[0]; // 5,6, 8, 9
		int secondMax = 0;

		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) { // 5, 6
				if (max > secondMax) { // 5>0
					secondMax = max; // 5
				}
				max = a[i];
			}
		}
		System.out.println(max);
		System.out.println(secondMax);
	}
}
