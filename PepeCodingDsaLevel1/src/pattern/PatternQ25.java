	package pattern;
	
	public class PatternQ25 {
	
		public static void main(String[] args) {
	//		* * * * * * *
	//		  *       *
	//	        *   *
	//	          *
	//			* * *
	//		  * * * * *
	//		* * * * * * *   
			int n=7;
			int nsp = 0;
			int ust =n;
			for(int i=1;i<=n;i++) {
				for(int j=1;j<=nsp;j++) {
					System.out.print("   ");
				}
				
				for(int j=1;j<=ust;j++) {
					if(i>1 && i<=n/2 && j>1 && j<ust) {
						System.out.print("   ");
					}else {
					System.out.print(" * ");
				    }
				}
				
				if(i<n/2+1) {
					nsp++;
					ust-=2;
				}else {
					nsp--;
					ust+=2;
				}
				
							
				System.out.println("\n");
			}
		}
	
	}
