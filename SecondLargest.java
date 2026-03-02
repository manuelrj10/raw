package pgm;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5,6,7,7};
		int largest=arr[0];
		int secLargest=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>largest) {
				secLargest=largest;
				largest=arr[i];	
			}
		}
		System.out.println("second largest"+secLargest);

	}

}
