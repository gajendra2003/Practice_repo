package exception;

import java.awt.datatransfer.Transferable;
import java.util.Hashtable;



public class TryCatch {

	public static void main(String[] args) 
	{
		try {
			//Arithmetic Exception
			int a=10;
			int b=0;
			System.out.println(a/b);
			//null pointer Exception
			Hashtable<String,String> table=new Hashtable<String ,String>();
			
			table.put(null, "anand");
			System.out.println(table.get(null));
	
		//catch (NullPointerException e) 
		//Stringindexoutofboundex ception
		String str="a";
		System.out.println(str.charAt(1));
		Thread.sleep(5000);
		
	} catch (Exception e) 
	{
		System.out.println(" fail divident is zero");
		
	
		{
			System.out.println(" fail: YOU HAVE PASS NULL KEY IN HASTABLE");
			}
			
		System.out.println("hello");

	}

	
	}}

