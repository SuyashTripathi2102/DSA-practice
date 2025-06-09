package BasicStartArray;

import java.util.Arrays;
import java.util.Scanner;

public class Q8 {public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	// k=3 arr[] = {1,2,3,4,5,6,7} {5,6,7,1,2,3,4} rotate by k
	int arr[] = {1,2,3,4,5,6,7};
	int k =3;
	int i=0;
	int j=arr.length-1;
	swap(arr,i,j);
	System.out.println(Arrays.toString(arr));
	swap(arr,i,k-1);
	System.out.println(Arrays.toString(arr));
	swap(arr,k,j);
	System.out.println(Arrays.toString(arr));
	
}
public static void swap(int arr[],int i,int j) {
	while(i<j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		i++;
		j--;
	}
}

}