
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class StudentHashMap{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashMap<String,Integer> map=new HashMap<>();
        System.out.println("enter the number of students");
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            System.out.println("enter the name");
            String name=sc.nextLine();
            
            System.out.println("enter the marks");
            int marks=sc.nextInt();
            sc.nextLine();
            map.put(name,marks);
        }
        for(Map.Entry<String,Integer> entry: map.entrySet()){
            System.out.println("name  "+entry.getKey()+" marks  "+entry.getValue());
        }
        
    }
}