import java.util.Scanner;

public class DigitOfNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num =sc.nextInt();
		int digit = 0;
		int rev =0;
		int r =0;
		int count=0;
		while(num>0) {
			r=num%10;
			rev=(rev*10)+r;
			num=num/10;
			count++;
		}
		System.out.println(rev);
		while(count>0) {
			digit = rev%10;
			System.out.println(digit);
			rev=rev/10;
			count--;
		}
	}

}
