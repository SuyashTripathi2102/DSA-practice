package BasicStartArray;

import java.util.Arrays;

public class Q11 {

	public static void main(String[] args) {
		//arr[]={1,3,2,6,2,4,6,3,1}
		//find only non duplicate number
		int arr[]={1,3,2,6,2,4,6,3,1};
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					arr[i]=arr[j]=-1;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>0) {
				System.out.println(arr[i]);
			}
		}
	}

}
