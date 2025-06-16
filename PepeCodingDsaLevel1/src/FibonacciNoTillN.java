import java.util.Scanner;

public class FibonacciNoTillN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int n1=0;
		int n2=1;
		System.out.println(n1+"\n"+n2);
		while(n-2>0) {
			int n3=n1+n2;
			System.out.println(n3);
			n1=n2;
			n2=n3;
			n--;
		}
		
	}

}
