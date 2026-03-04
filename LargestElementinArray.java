class LargestElementinArray{
    public static void main(String args[]){
        int[] arr={1,2,3,4,56,99,2,22};
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println("max element in array"+max);

    }
}