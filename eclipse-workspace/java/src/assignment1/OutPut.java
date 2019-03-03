package assignment1;

public class OutPut {

	public static void main(String[] args) {

		/*
		 * int i = 2; f1(1);
		 * 
		 * }
		 * 
		 * public static void f1(int i) { f2(i + 1); }
		 * 
		 * public static void f2(int i) { f3(i + 2); }
		 * 
		 * public static void f3(int i) { System.out.println(i + 3); }
		 */
		int x = 0;
		while (true) {
			x = increment(x);

			System.out.println("Value of x is --" + x);

			if (x > 10)
				break;

		}
	}

	public static int increment(int i) {
		return i + 1;
	}
}
