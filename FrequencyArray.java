package pgm;

public class FrequencyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] freq=new int[9];
		int[] arr= {1,1,2,2,3,3,3,4,5};
		for(int i=0;i<arr.length;i++) {
			int index=arr[i];
			freq[index]++;
		}
		for(int i=0;i<freq.length;i++) {
			if(freq[i]>0) {
				System.out.println("num is"+i+"and frequency is"+freq[i]);
				
			}
		}
	}

}
