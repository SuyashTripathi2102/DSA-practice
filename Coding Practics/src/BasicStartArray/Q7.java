package BasicStartArray;

import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		//checking array is palindrome or not
		//arr[] = {1,2,3,2,1}
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int flag = 0;
		for(int i=0;i<n;i++) {
			if(arr[i]!=arr[n-i-1]) {
				flag=1;
				break;
			}
		}
		if(flag==1) {
			System.out.println("Not a Palindrome");
		}else {
			System.out.println("its a palindrome");
		}
	}

}
