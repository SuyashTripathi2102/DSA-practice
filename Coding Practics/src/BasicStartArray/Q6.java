package BasicStartArray;

import java.util.Arrays;
import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		//arr[] = {1,2,3,4,5,6} reverse array without using extra array
		//arr[] = {6,5,4,3,2,1}
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int i=0;
		int j=n-1;
		System.out.println(Arrays.toString(arr));
		while(i<j) {
			int temp = arr[i];
			arr[i] = arr [j];
			arr[j] =temp;
			i++;
			j--;
		}
		System.out.println(Arrays.toString(arr));
	}

}
