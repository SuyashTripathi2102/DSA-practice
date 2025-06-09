package BasicStartArray;

import java.util.Arrays;
import java.util.Scanner;

public class Q3 {
	public static void main(String args[]) {
		// arr[] = {1,2,3,4,5,6,7,8} pair-sum =12
		Scanner sc = new Scanner(System.in);
		System.out.println("size of array");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("array "+Arrays.toString(arr));
		int x=12;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]+arr[j]==x) {
					System.out.println("the pair of sum 12 is "+arr[i]+","+arr[j]);
				}
			}
		}
	}
}
