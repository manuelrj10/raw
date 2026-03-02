package pgm;

import java.util.Arrays;

public class DuplicateElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,2,3,3,4,5};
		int high=0;
		int low=0;
		for(high=0;high<arr.length;high++) {
			if(arr[low]!=arr[high]) {
				low++;
				arr[low]=arr[high];
			}
		}
		
		for(int i=0;i<low+1;i++) {
			System.out.println(arr[i]);		
			}
		//System.out.println(Arrays.toString(arr));

		
	}
	
}
