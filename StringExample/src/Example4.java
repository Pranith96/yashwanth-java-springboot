import java.util.Arrays;

public class Example4 {

	public static void main(String[] args) {
		String s = "Hello World 123";
		String[] str = s.split("\\s");
		System.out.println(Arrays.toString(str));
	}
}
