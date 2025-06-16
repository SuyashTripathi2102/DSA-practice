import java.util.Scanner;

public class PythagoreanTriplets {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int flag =0;
		int asq = a*a;
		int bsq = b*b;
		int csq = c*c;
		if((asq==bsq+csq)|| (bsq==asq+csq) || (csq==asq+bsq)) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	}
}
