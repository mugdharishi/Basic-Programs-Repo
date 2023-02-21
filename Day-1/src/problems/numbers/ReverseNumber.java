package problems.numbers;

import java.util.Scanner;

public class ReverseNumber {
	public static int reverseNumber(int num){
		int temp=num;
		if(num<0) {
			temp = -num;
		}
		
		
		int revNum=0;
		
		while(temp>0) {
			revNum=revNum*10+temp%10;
			temp=temp/10;
		}
		if(num<0) {
			return -revNum;
		}
		return revNum;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number : ");
		int number = sc.nextInt();
		
		int revNumber = reverseNumber(number);
		System.out.println("Reverse Number : "+revNumber);
	}
}
