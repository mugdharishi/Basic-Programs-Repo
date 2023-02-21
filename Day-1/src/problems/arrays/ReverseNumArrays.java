package problems.arrays;

import java.util.Scanner;

public class ReverseNumArrays {
	public static void reverseArrays(int[] arr) {
		int last=arr.length-1;
		int temp;
		
		for(int i=0;i<arr.length/2;i++) {
			temp = arr[i];
			arr[i] = arr[last];
			arr[last] = temp;
			last--;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arrNum ;
		
		System.out.println("Enter number of elements you want");
		int num= sc.nextInt();
		arrNum = new int[num];
		
		System.out.println("Enter "+ num + " elements : ");
		for(int i=0;i<num;i++) {
			arrNum[i]=sc.nextInt();
		}
		
		//Reverse Array
		reverseArrays(arrNum);
		System.out.println("Reversed Array :");
		
		for(int i=0;i<arrNum.length;i++) {
			System.out.print(arrNum[i]+" ");
		}
	}
}
