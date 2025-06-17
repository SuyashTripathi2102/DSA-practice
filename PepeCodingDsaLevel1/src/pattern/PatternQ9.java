package pattern;

public class PatternQ9 {

	public static void main(String[] args) {
//		1 
//		2 3 
//		4 5 6 
//		7 8 9 10 

		int n = 4;
		int a=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(a+" ");
				a++;
			}
			
			System.out.println();
		}
	}

}
