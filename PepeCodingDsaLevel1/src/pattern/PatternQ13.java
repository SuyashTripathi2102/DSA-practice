package pattern;

public class PatternQ13 {
	public static void main (String args[]) {
//        * 
//
//     *  *  * 
//
//  *  *  *  *  * 
//
//*  *  *  *  *  *  * 
		int n =4;
		int a = 1;
		int nsp = n-1;
		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<=nsp;j++) {
				System.out.print("   ");
			}
			for(int k=1;k<=a;k++) {
				System.out.print(" * ");
			}
			a=a+2;
			nsp --;
			System.out.println("\n");

		}
	}
}
