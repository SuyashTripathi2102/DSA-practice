package pattern;

public class PatternQ23 {

	public static void main(String[] args) {
//		1                 1  
//
//		1  2           2  1  
//
//		1  2  3     3  2  1  
//
//		1  2  3  4  3  2  1  
		int n=4;
		int nsp = 2*n-3;
		int m=2*n-1;
		int b=1;
		for(int i=1;i<=n-1;i++) {
			int a=1;
			for(int j=1;j<=i;j++) {
				System.out.print(a+"  ");
				a++;
			}
			for(int j=1;j<=nsp;j++) {
				System.out.print("   ");
			}
			a--;
			for(int j=1;j<=i;j++) {
				System.out.print(a+"  ");
				a--;
			}
			nsp=nsp-2;			
			System.out.println("\n");
		}
		int c=1;
		int mid=m/2+1;
		for(int j=1;j<=m;j++) {
			System.out.print(c+"  ");
			if(j<mid) {
				c++;
			}else {
				c--;
			}
		}
	}

}

//  PEPECODEING SIR LOGIC --

//int st = 1;           // number of values on each side
//int sp = 2 * n - 3;   // number of spaces in the middle
//
//for (int i = 1; i <= n; i++) {
//    int val = 1;
//
//    // Left numbers
//    for (int j = 1; j <= st; j++) {
//        System.out.print(val + "\t");
//        val++;
//    }
//
//    // Middle spaces
//    for (int j = 1; j <= sp; j++) {
//        System.out.print("\t");
//    }
//
//    // Middle row fix: avoid repeating center number
//    if (i == n) {
//        st--;
//        val--;
//    }
//
//    // Right numbers (in reverse)
//    for (int j = 1; j <= st; j++) {
//        val--;
//        System.out.print(val + "\t");
//    }
//
//    st++;
//    sp -= 2;
//    System.out.println();
//}
