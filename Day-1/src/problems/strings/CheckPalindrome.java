package problems.strings;
import static problems.strings.ReverseString.reverseString;

import java.util.Scanner;

public class CheckPalindrome {
	
	public static boolean checkPalindrome(String str) {
		if(str.equals(reverseString(str))) {
			return true;
		}		
		return false;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the String : ");
		String str = sc.nextLine();
		
		boolean result = checkPalindrome(str);
		if(result==true) {
			System.out.println("String is Palindrome ");
		}
		else {
			System.out.println("String is not Plaindrome");
		}
	}
}
