
public class DigitsFrequency {
	public static void frequency(int num , int n) {
		int count=0;
		int r=0;
		while(num>0) {
			r=num%10;
			if(r==n) {
				count++;
			}
			num=num/10;
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		int num = 95439692;
		int n=9;
		int m=4;
		frequency(num, n);
		frequency(num, m);
	}

}
