import java.util.Scanner;

public class InverseOfANumber {

	public static void main(String[] args) {
		// inverse of a number
		// it goes from right to left
		// number- 2 4 6 1 3 5
		// index-  6 5 4 3 2 1
		// output- 4 1 5 2 6 3
		
		Scanner sc =new Scanner(System.in);
		int num = sc.nextInt();
		int index = 1;
		int inv = 0;
		while(num>0) {
			int r = num%10;
			inv = index * (int)Math.pow(10, r - 1) + inv;
			num=num/10;
			index++;
		}
		System.out.println(inv);
	}

}
