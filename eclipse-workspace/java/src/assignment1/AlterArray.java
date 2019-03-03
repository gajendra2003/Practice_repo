package assignment1;

public class AlterArray {

	public static void main(String[] args) {
		/*
		String str="welcome";
		char[] strChars= str.toCharArray();
		for(int i=0; i< strChars.length;i+=2) {
		
			
			System.out.println(strChars[i]);
		*/
		String str[]= new String[] {"welcome"};
		for(int i=0; i<str[0].length();i+=2) {
			System.out.println(str[0].charAt(i));
		}
		}

	}


