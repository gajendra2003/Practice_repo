package array;

public class Arr2 {
 public static void main(String args[]) {
	 
	String [][] str= new String[2][4];
	//row1
	str[0][0]="Vikas";
	str[0][1]="Indve";
	str[0][2]="Vsy";
	str[0][3]="pune";
	//row2
	str[1][0]="Vishal";
	str[1][1]="pandey";
	str[1][2]="Cybage"; 
	str[1][3]="jbl";
	
	for(int r=0; r< str.length;r++)
	
	{
		for(int c=0; c<str[r].length;c++)
			
		{
		System.out.println(str[c][r]);
	}
}
 }
}
		
	


