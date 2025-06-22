package pattern;

public class PatternQ20 {

	public static void main(String[] args) {
//	          * 
//
//	       *     * 
//
//	    *           * 
//
//	       *     * 
//
//	          * 

		int n=5;
		int osp = n/2;
		int isp = -1;
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=osp;j++) {
				System.out.print("   ");
			}
			System.out.print(" * ");
			for(int j=1;j<=isp;j++) {
				System.out.print("   ");
			}
			if(i>1 && i<n) {
				System.out.print(" * ");
			}
			if(i<=n/2) {
				osp--;
				isp+=2;
			}else {
				osp++;
				isp-=2;
			}
			System.out.println("\n");
		}
	}

}
