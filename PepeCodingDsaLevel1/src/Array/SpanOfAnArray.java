package Array;

import java.util.Scanner;

public class SpanOfAnArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int num = sc.nextInt();
		int Max = Integer.MIN_VALUE;
		int Min = Integer.MAX_VALUE;
		int span =0;
		int arr[] = new int[num];
		for(int i=0;i<num;i++) {
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>Max) {
				Max=arr[i];
			}
			if(arr[i]<Min) {
				Min=arr[i];
			}
		}
		span = Max-Min;
		System.out.println(span);
	}

}
