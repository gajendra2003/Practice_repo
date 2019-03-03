package java1;

public class Testing4 {
	public static void main(String[] args)
	{
		int a=10;
		int b=20;
		int c=30;
		if(a>b && b>c || a>c) {
		
		
			System.out.println("a is greatest");
				
			}
		
			else if(b>a && a>c)
		{
		System.out.println("b is greatest");
			
		
			
		}
	   else if(c>a && a>c ||c>b) {
			System.out.println("c is greatest");
			
		}
	}
}
