import java.util.Scanner;

public class PrimeFactorization {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int num = sc.nextInt();
		int i=2;
		while(i*i<=num) {
			if(num%i==0) {
				System.out.println(i);
				num=num/i;
			}else {
				i++;
			}
		}
		if(num>1) {
			System.out.println(num);
		}
		
	}

}
