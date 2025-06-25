package Array;

import java.util.Scanner;

public class SumOfTwoArrays {

	public static void main(String[] args) {
		 Scanner scn = new Scanner(System.in);

	        // Input array a1
	        int n1 = scn.nextInt();
	        int[] a1 = new int[n1];
	        for (int i = 0; i < n1; i++) {
	            a1[i] = scn.nextInt();
	        }

	        // Input array a2
	        int n2 = scn.nextInt();
	        int[] a2 = new int[n2];
	        for (int i = 0; i < n2; i++) {
	            a2[i] = scn.nextInt();
	        }

	        // Sum array of size max(n1, n2)
	        int[] sum = new int[Math.max(n1, n2)];

	        int i = a1.length - 1;
	        int j = a2.length - 1;
	        int k = sum.length - 1;
	        int c = 0; // carry

	        // Add digits from right to left
	        while (k >= 0) {
	            int d = c;

	            if (i >= 0) d += a1[i];
	            if (j >= 0) d += a2[j];

	            c = d / 10; // update carry
	            d = d % 10; // digit to store

	            sum[k] = d;

	            i--;
	            j--;
	            k--;
	        }

	        // If carry is still left, print it
	        if (c != 0) {
	            System.out.println(c);
	        }

	        // Print the sum array
	        for (int val : sum) {
	            System.out.println(val);
	        }
		
		
	}

}
