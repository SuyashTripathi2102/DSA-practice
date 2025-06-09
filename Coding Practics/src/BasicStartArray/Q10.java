package BasicStartArray;

import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//arr[] ={1,2,7,4,5,6,7}
		//find duplicate
		int arr[] ={1,2,7,4,5,6,7};
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println("duplicate"+ arr[i]);
				}
			}
		}
	}

}
