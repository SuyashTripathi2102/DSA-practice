package pattern;

public class PatternQ12 {

	public static void main(String[] args) {
//   ****
//
//  ****
//
// ****
//
//****
		int n=4;
		for(int i=1;i<=n;i++) {
			for(int k=i;k<n;k++) {
				System.out.print(" ");
			}
			for(int j=1;j<=n;j++) {
				System.out.print("*");
			}
			
			System.out.println("\n");
		}
	}

}
