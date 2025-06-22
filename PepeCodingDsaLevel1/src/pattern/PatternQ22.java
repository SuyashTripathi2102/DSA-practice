package pattern;

public class PatternQ22 {

	public static void main(String[] args) {
//	      	 1  
//
//	      2  3  2  
//
//	   3  4  5  4  3  
//
//	      2  3  2  
//
//	         1  


		int n=5;
		int nsp=n/2;
		int nst=1;
		int ml=n/2+1;
		int a=1;
		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<=nsp;j++) {
				System.out.print("   ");
			}
			int b=a;
			for(int j=1;j<=nst;j++) {
				
				System.out.print(b+"  ");
				
				if(j<nst/2+1) {
					b++;
				}else {
					b--;
				}
			} 
			if(i<ml) {
				nsp--;
				nst=nst+2;
				a++;
			}else {
				nsp++;
				nst=nst-2;
				a--;
			}
			System.out.println("\n");
		}
	}

}
