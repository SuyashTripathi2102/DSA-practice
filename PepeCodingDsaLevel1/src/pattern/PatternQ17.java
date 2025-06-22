package pattern;

public class PatternQ17 {

	public static void main(String[] args) {
//		 *  *  *     *  *  * 
//
//		 *  *           *  * 
//
//		 *                 * 
//
//		 *  *           *  * 
//
//		 *  *  *     *  *  * 
		int n =5;
		int nst = n/2+1;
		int nsp = 1;
		int ml=n/2+1;
		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<=nst;j++) {
				System.out.print(" * ");
			}
			for(int k=1;k<=nsp;k++) {
				System.out.print("   ");
			}
			for(int j=1;j<=nst;j++) {
				System.out.print(" * ");
			}
			if(ml>i) {
				nst--;
				nsp=nsp+2;
			}else {
				nsp=nsp-2;
				nst++;
			}
			System.out.println("\n");

		}
	}

}
