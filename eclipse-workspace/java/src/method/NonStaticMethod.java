package method;

public class NonStaticMethod {

	public static void main(String[] args) 
	{
	NonStaticMethod	obj=new NonStaticMethod();
	
	obj.sum(10,20);
	}
	public int sum(int a,int b) 
	{
		return a+b;
	}

}
