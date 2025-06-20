package pattern;

public class PatternQ15 {

	public static void main(String[] args) {
//	        1 
//
//	      1 2 1 
//
//	    1 2 3 2 1 
//
//	  1 2 3 4 3 2 1 
		int n=4;
		for(int i=1;i<=n;i++) {
			int a=1;
			for(int j=i;j<n;j++) {
				System.out.print("  ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(k+" ");
			}
			for(int l = i - 1; l >= 1; l--) {
		        System.out.print(l+" ");
		    }
			System.out.println("\n");
		}
	}

}
