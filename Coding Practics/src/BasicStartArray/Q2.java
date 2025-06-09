package BasicStartArray;

import java.util.Arrays;
import java.util.Scanner;

public class Q2 {
	public static void main (String args[]) {
		// arr[] = {10,30,50,20,40,22} find max element
			Scanner sc = new Scanner (System.in);
			System.out.println("Size of array ");
			int n = sc.nextInt();
			
			int arr[] = new int[n];
			for(int i=0;i<n;i++) {
				arr[i]=sc.nextInt();
			}
			System.out.println(Arrays.toString(arr));
			int max = Integer.MIN_VALUE;
			for(int i=0;i<n;i++) {
				if(arr[i]>max) {
					max=arr[i];
				}
			}
			System.out.println("max value "+max);
	}
}
