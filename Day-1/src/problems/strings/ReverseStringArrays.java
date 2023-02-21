package problems.strings;

import java.util.Scanner;

public class ReverseStringArrays {
	public static void reverseArrays(String[] arr) {
		int last=arr.length-1;
		String temp;
		
		for(int i=0;i<arr.length/2;i++) {
			temp = arr[i];
			arr[i] = arr[last];
			arr[last] = temp;
			last--;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] arrStr ;
		
		System.out.println("Enter number of elements you want");
		int num= sc.nextInt();
		arrStr = new String[num];
		
		System.out.println("Enter "+ num + " elements : ");
		for(int i=0;i<num;i++) {
			arrStr[i]=sc.next();
		}
		
		//Reverse Array
		reverseArrays(arrStr);
		System.out.println("Reversed Array :");
		
		for(int i=0;i<arrStr.length;i++) {
			System.out.print(arrStr[i]+" ");
		}
	}
}
