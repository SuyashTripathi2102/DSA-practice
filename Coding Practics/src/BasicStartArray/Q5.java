package BasicStartArray;

import java.util.Arrays;
import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		//arr[] = {1,2,3,4,5,6} reverse array using extra array
		//arr1[] = {6,5,4,3,2,1}
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int arr1[]= new int[n];
		for(int i=0;i<n;i++) {
			arr1[i]=arr[n-i-1];
		}
		System.out.println(Arrays.toString(arr1));
	}

}
