package abstraction;

public class Demo {

	public static void main(String[] args)
	{
		Sprint3 obj=new Sprint3();
		obj.compose();
		obj.send();
		obj.forward();
		obj.reply(); 
		obj.newMethod();
		
		OutLook obj2=new Sprint3();
		obj.compose();
		obj.send();
		obj.forward();
		obj.reply(); 
		
		obj2.attachment();
	
	
		}

}

