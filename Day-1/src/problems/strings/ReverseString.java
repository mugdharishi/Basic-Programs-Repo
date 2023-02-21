package problems.strings;

import java.util.Scanner;

public class ReverseString {
	public static String reverseString(String string){
		char ch;
		String revString="";
		for(int i=string.length()-1;i>=0;i--) {
			ch=string.charAt(i);
			revString=revString+ch;
		}
		
		return revString;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the String : ");
		String string = sc.nextLine();
		
		String revString = reverseString(string);
		System.out.println("Reverse String : "+revString);
	}
}
