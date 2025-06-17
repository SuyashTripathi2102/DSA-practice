package pattern;

public class PatternQ10 {

	public static void main(String[] args) {
//		1 
//		3 5 
//		7 9 11 
//		13 15 17 19 

		int n = 4;
		int a=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(a+" ");
				a=a+2;
			}
			
			System.out.println();
		}
	}

}
