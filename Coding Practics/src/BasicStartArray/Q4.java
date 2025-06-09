package BasicStartArray;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		// second largest elements
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int max= Integer.MIN_VALUE;
		int secMax = Integer.MIN_VALUE;
		
		for(int i=0;i<n;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		for(int i=0;i<n;i++) {
			if(arr[i]>secMax && arr[i]!=max) {
				secMax=arr[i];
			}
		}
		System.out.println(secMax+" second Max value");
	}

}
