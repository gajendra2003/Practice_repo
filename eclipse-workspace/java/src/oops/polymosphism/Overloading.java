package oops.polymosphism;

public class Overloading {
	static int calculation(int a,int b)
	{
		return a+b;
	}
	static double calculation(Double a ,Double b,Double c) {
		return a+b+c;
	}
	public static void main(String[] args) {
		System.out.println(Overloading.calculation(10, 20));
		System.out.println(Overloading.calculation(10.11, 12.11, 13.11));
		
		
	}
	
		
	}