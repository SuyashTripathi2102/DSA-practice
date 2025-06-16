import java.util.Scanner;

public class GCDandLCM {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int num1= sc.nextInt();
		int num2 = sc.nextInt();
		int com1 = 0;
		int com2 = 0;
		int GCD =0;
		for(int i=2;i<num1;i++) {
			if(num1%i==0&&num2%i==0) {
				GCD=i;
			}
		}
		System.out.println(GCD);
		int LCM = num1*num2/GCD;
		System.out.println(LCM);
	}

}
