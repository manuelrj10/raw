
import java.util.Scanner;

class StringManupulation{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a line");
        String str=sc.nextLine();
        String[] arr=str.split(" ");
        System.out.println("length is"+arr.length);
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<arr.length;i++){
            StringBuilder temp=new StringBuilder(arr[i]);
            sb.append(temp.reverse());
            sb.append(" ");
        
    }
    int vowelCount=0;
    for(int i=0;i<arr.length;i++){
        char[] word=arr[i].toLowerCase().toCharArray();
        for(int j=0;j<word.length;j++){
            if(word[j]=='i'||word[j]=='e'||word[j]=='a'||word[j]=='o'||word[j]=='u'){
                vowelCount++;
            }
        }
    }
    System.out.println("vowel count"+vowelCount);
    System.out.println(sb.toString());
}
}