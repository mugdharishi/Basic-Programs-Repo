package problems.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class FindUniqueAndDuplicate {

	public static int[] findUnique(int[] arr) {
		int unique[]=new int[arr.length];
		int index=-1;
		boolean flag=false;

		for(int i=0;i<arr.length;i++) {
			flag=false;

			for(int j=0;j<i;j++) {
				if(arr[i]==unique[j]) {
					flag=true;
					break;
				}	
			}
			if(flag!=true)
				unique[++index]=arr[i];
		}
		return unique;
	}

	public static int[] findDuplicate(int[] arr) {
		int unique[]=new int[arr.length];
		int duplicate[] = new int[arr.length/2];

		int indexUn=-1;
		int indexDup=-1;

		boolean flag=false;
		boolean flagDup=false;

		//i=> arr
		for(int i=0;i<arr.length;i++) {
			flag=false;

			//j=> unique
			for(int j=0;j<i;j++) {
				if(arr[i]==unique[j]) {
					
					flagDup=false;
					//k=>duplicate
					for(int k=0;k<i;k++){
						if(arr[i]==duplicate[k])
							flagDup=true;
						break;
					}
					if(flagDup!=true)
						duplicate[++indexDup]=arr[i];

					flag=true;
					break;
				}	
			}
			if(flag!=true)
				unique[++indexUn]=arr[i];
		}
		return duplicate;

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

		System.out.println("Unique Elements: ");
		int[] unique=findUnique(arrNum);
		System.out.println(Arrays.toString(unique));

		System.out.println("Duplicate Elements: ");
		int[] duplicate=findDuplicate(arrNum);
		System.out.println(Arrays.toString(duplicate));


	}


}
