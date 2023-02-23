package problems.numbers;

import java.util.Scanner;

public class PrimeNumbersInRange {
	
	public static boolean checkPrime(int num) {
		if(num==0 || num==1)
			return false;
		
		for(int i=2;i<=num/2;i++) {
			if(num%i==0)
			return false;
		}
		return true;
	}
	
	public static int[] primeNumbersInRange(int start, int end) {
		
		int size;
		
		if(start==end)
			size=1;
		else {
			size=(end-start)>=0 ? end-start:start-end;
		}
		
		//The MAXIMUM numbers between range end-start
		int[] arr=new int[size];
		int index=-1;
		
		for(int i=start;i<=end;i++)
		{
			if(checkPrime(i)==true) {
				arr[++index]=i;
			}
		}
		return arr;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int start, end;
		int[] arr;
		
		System.out.println("Enter the range to get Prime Numbers(Including Boundaries) : ");
		
		System.out.print("Start : ");
		start = sc.nextInt();
		
		System.out.print("End : ");
		end = sc.nextInt();
		
		arr=primeNumbersInRange(start,end);
		
		System.out.println("Prime numbers between "+start+" and "+ end+"(Including boundaries) : ");
		for(int i=0;i<arr.length;i++) {
		
			//break loop after null elements in array starts
			if(arr[i]==0) {
				break;
			}
			System.out.print(arr[i]+" ");
		}
	}
}
