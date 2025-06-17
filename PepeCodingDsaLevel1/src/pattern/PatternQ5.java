package pattern;

import java.util.Scanner;

public class PatternQ5 {

	public static void main(String[] args) {
//		1
//
//		13
//
//		135
//
//		1357
//
//		13579

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			int a=1;
			for(int j=1;j<=i;j++) {
				System.out.print(a);
				a=a+2;
			}
			System.out.println("\n");
		}
	}

}
