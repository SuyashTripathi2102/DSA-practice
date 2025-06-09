package BasicStartArray;

import java.util.Arrays;
import java.util.Scanner;

public class Q1 {
	public static void main( String args[]) {
		//arr[] = {25,30,35,38,26,37,15}
		Scanner sc = new Scanner (System.in);
		
		System.out.println("give a length of an array");
		int n=sc.nextInt();
		int arr[] = new int[n]; // Dynamaic array 
		
		for(int i = 0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(arr.toString()+ " arr "); // this will print object reference
		// to print array -
		System.out.println(Arrays.toString(arr));
		
		for(int i=0;i<n;i++) {
			if(arr[i]<35) {
				System.out.println(arr[i]+" marks less than 35");
			}
		}
		
		
	}
}
