import java.util.Scanner;

public class BenjanminBulbs {

	public static void main(String[] args) {
		/*
		 * n = 5
		Initially: [OFF, OFF, OFF, OFF, OFF]
		Wave 1: toggle every 1st bulb → [ON, ON, ON, ON, ON]
		Wave 2: toggle every 2nd bulb → [ON, OFF, ON, OFF, ON]
		Wave 3: toggle every 3rd bulb → [ON, OFF, OFF, OFF, ON]
		Wave 4: toggle every 4th bulb → [ON, OFF, OFF, ON, ON]
		Wave 5: toggle every 5th bulb → [ON, OFF, OFF, ON, OFF]
		*/
		
		Scanner sc =new Scanner (System.in);
		int num =sc.nextInt();
		for(int i=1;i*i<num;i++) {
			System.out.println((i*i)+" ");
			
		}
	}

}
