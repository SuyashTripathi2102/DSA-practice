package pattern;

public class PatternQ16 {

	public static void main(String[] args) {
//	          * 
//
//	       *  *  * 
//
//	    *  *  *  *  * 
//
//	       *  *  * 
//
//	          * 
//

		int n =5;
		int a = 1;
		int nsp = n/2;
		int ml=n/2+1;
		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<=nsp;j++) {
				System.out.print("   ");
			}
			for(int k=1;k<=a;k++) {
				System.out.print(" * ");
			}
			if(ml>i) {
				a=a+2;
				nsp --;
			}else {
				a=a-2;
				nsp++;
			}
			System.out.println("\n");

		}
	}

}
