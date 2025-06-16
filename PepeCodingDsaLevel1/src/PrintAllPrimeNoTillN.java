import java.util.Scanner;

public class PrintAllPrimeNoTillN {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int low = sc.nextInt();
		int high = sc.nextInt();
		for(int i=low;i<=high;i++) {
			int flag =0;
			for(int k=2;k*k<=i;k++) {
				if(i%k==0) {
					flag=1;
					break;
				}
			}
			if(flag==0) {
				System.out.println(i);
			}
		}
	}

}
