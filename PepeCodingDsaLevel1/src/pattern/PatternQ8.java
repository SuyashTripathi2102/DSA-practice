package pattern;

public class PatternQ8 {

	public static void main(String[] args) {
//		 *           * 
//		    *     *    
//		       *       
//		    *     *    
//		 *           * 

		int n =5;
		for(int i=1;i<=n;i++) {
			int a=n;
			for(int j=1;j<=n;j++) {
				if(i==j||i==a) {
				System.out.print(" * ");
				}else {
				System.out.print("   ");
				}
				a--;
			}
			System.out.print("\n");
		}
	}

}
