package pattern;

public class PatternQ24 {

	public static void main(String[] args) {
//	       * 
//
//	       *  * 
//
//	 *  *  *  *  * 
//
//	       *  *  
//
//	       * 
//		for(int i=1;i<=n;i++) {
//			int nsp = n/2;
//			int nst;
//			if(i == 1 || i == n) {
//                nst = 1;
//			}
//			else if(i==mid) {
//				nsp=0;
//				nst = n;
//			}else {
//				
//				nst=2;
//				
//			}
//			for(int j=1;j<=nsp;j++) {
//				System.out.print("   ");
//			}
//			for(int j=1;j<=nst;j++) {
//				System.out.print(" * ");
//			}
//			
//			if(i<mid) {
//				
//				nst++;
//			}else {
//				nst=nst-2;
//				
////			}
//			System.out.println("\n");	
//			
//		}
		
		int n = 5;
		int mid=n/2+1;
		int nst = 1;
		int nsp=n/2;
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=nsp;j++) {
				if(i==mid) {
					System.out.print(" * ");
				}else {
				    System.out.print("  ");
				}
			}	
			for(int j=1;j<=nst;j++) {
				System.out.print(" * ");
			}
			if(i<mid) {
				nst++;
			}else {
				nst--;
			}
			System.out.println("\n");
		}
		
		
	}

}
