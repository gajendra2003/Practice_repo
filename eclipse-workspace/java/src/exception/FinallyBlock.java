package exception;

public class FinallyBlock {

	public static void main(String[] args) {
		try {
			int a = 10;
			int b = 10;
			int c = a / b;
			System.out.println(c);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {

			System.out.println("Executing finally block");
		}
		 fun1();

	}

public static void fun1()throws Throwable
{
	
}

}