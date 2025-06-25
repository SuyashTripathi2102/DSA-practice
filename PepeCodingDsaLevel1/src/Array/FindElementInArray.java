package Array;

import java.util.Scanner;

public class FindElementInArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int num = sc.nextInt();
		int snum = sc.nextInt();
		int arr[] = new int[num];
		for(int i=0;i<num;i++) {
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == snum) {
				System.out.println(i);
			}
		}
	}

}
