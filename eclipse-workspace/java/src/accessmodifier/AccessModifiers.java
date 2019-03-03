package accessmodifier;

public class AccessModifiers {

	public static void main(String[] args) {
		AccessModifiers obj= new AccessModifiers();
		obj.publicMethod();
		obj.privateMethod();
		obj.noAccessMethod();
		obj.protectedMethod();

	}
	public void publicMethod() {
		System.out.println("public method");
	}

	private void privateMethod() {
		System.out.println("private method");
	}

	public void protectedMethod() 
	{
		System.out.println("protecetd method");
			
		}

	 void noAccessMethod() {
		System.out.println("no access method");
	
	

}
}