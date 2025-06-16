import java.util.Scanner;

public class IsAPrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		//System.out.println("Enter the t cases");
		int t = sc.nextInt();
		for(int k=0;k<t;k++) {
			//System.out.println("Enter the number");
			int number = sc.nextInt();
			int flag =1;
			if(number<=1) {
				flag =0;
			}else {
				for(int i=2;i<number;i++) {
					if((number%i )==0) {
						//System.out.println("number"+((number/i)==0));
						flag=0;	
						break;
					}
				}
			}
			if(flag==1) {
				System.out.println("it is a prime a number");
			}else {
				System.out.println("Not a prime number");
			}
		}
		
	}

}
