package method;

public class ReturnsArray {

	public static void main(String[] args) {
		String [][] str1= test();
		for(int r=0; r<str1.length;r++) {
			for(int c=0; c<str1.length;c++) {
				System.out.println(str1[r][c]);
			}
		}

	}
  public static String[][] test()
  {
	  String [][] str= {{"u1","p1","a1"},{"u2","p2","a2"},{"u3","p3","a3"}};
	  return str;
  }
  public  static ReturnsArray test2() {
	  return new ReturnsArray();
	
}
  public static String test3() {
	  return"test meassge";
  }
  public static int sum(int a , int b)  {
	  return a+b;
	  
  }
}
