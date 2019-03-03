package Reflections;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import file.Excel.Xls_Reader;

public class Executor {

	public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException 
	{
	Xls_Reader xl= new Xls_Reader("D:\\gajendra\\selenium\\UserLogin.xls");
	String tcName =xl.getCellData("Keywords", 2, "TC_Name");
	System.out.println(tcName);
	String[]  Keywords=xl.getCellData("Keywords", 2,"Keywords").split(",");
	
	System.out.println(tcName);
	  
	Class c=Class.forName("Reflections."+tcName);
	Object obj=c.newInstance();
	Method m=c.getDeclaredMethod(Keywords[1]);
	m.invoke(obj);
	
	

	}

}
