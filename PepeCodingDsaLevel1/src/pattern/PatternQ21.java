package pattern;

public class PatternQ21 {

	public static void main(String[] args) {
//		0 
//
//		1 1 
//
//		2 3 5 
//
//		8 13 21 34 

		int n =4;
		int a= 0;
		int b= 1;
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(a+" ");
				int c=a+b;
				a=b;
				b=c;
			}
			System.out.println("\n");
		}
	}

}
