package Array;

import java.util.Scanner;

public class BarChart {
	public static void bar (int arr) {
		for(int i=1;i<=arr;i++) {
			System.out.print("*");
		}
		System.out.println("\n");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int num = sc.nextInt();
		int arr[] = new int[num];
		for(int i=0;i<num;i++) {
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<num;i++) {
			bar(arr[i]);
		}
	}

}
