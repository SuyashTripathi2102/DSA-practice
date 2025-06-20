package pattern;

public class PatternQ14 {

	public static void main(String[] args) {
//        1  
//
//     1  2  3  
//
//  1  2  3  4  5  
//
//1  2  3  4  5  6  7  

		int n =4;
		int a = 1;
		for(int i=1;i<=n;i++) {
			
			for(int j=i;j<n;j++) {
				System.out.print("   ");
			}
			for(int k=1;k<=a;k++) {
				System.out.print(k+"  ");
			}
			a=a+2;
			System.out.println("\n");

		}
	}

}
