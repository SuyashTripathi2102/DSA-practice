import java.util.Scanner;

public class RotateANumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int num=sc.nextInt();
		int k = sc.nextInt();
		
		int temp = num;
		int count =0;
		
		while(temp>0) {
			temp=temp/10;
			count++;
		}
		k = k%count;
		if(k<=0) {
			k=k+count;
		}
		int pow = (int)Math.pow(10, k);
		int q=num/pow;
		int r =num%pow;
		int rot = r*(int)Math.pow(10, count-k)+q;
		System.out.println(rot);
	}

}
