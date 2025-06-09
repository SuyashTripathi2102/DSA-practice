package BasicStartArray;

import java.util.Arrays;
import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) {
		//arr[] = {1,2,3,4,5,6,7} x=5 find x in array
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x=5;
		int arr[] = new int [n];
		for(int i=0;i<n;i++) {
			arr[i]= sc.nextInt();
		}
		int flag=1;
		int index=0;
		for(int i=0;i<n;i++) {
			if(x==arr[i]) {
				flag =0;
				index=i;
				break;
				
			}
			
		}
		if(flag==1) {
			System.out.println("number is not found");
		}else {
			System.out.println("the index of number is "+index);
		}
	}

}
