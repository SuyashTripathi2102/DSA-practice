import java.util.Scanner;

public class CountDigitInANumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		long num = sc.nextLong();
		int count=0;
		while(num>0) {
			count++;
			num=num/10;
		}
		System.out.println(count);
	}

}
