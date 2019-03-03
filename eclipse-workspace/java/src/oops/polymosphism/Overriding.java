package oops.polymosphism;

class Teacher{
	public void study() {
		System.out.println("hello class x ");
	}
}
 class Student extends Teacher{
	 public void study() {
		 System.out.println("hello class xi");
	 }
 }

public class Overriding {

	public static void main(String[] args) {
		Teacher obj=new Teacher();
		Teacher obj1=new Student();
		obj.study();
		obj1.study();

	}

}
