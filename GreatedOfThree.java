
import java.util.Scanner;

class GreatedOfThree{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter value of first number");
        int a=sc.nextInt();
        System.out.println("enter value of second number");
        int b=sc.nextInt();
        System.out.println("enter value of third number");
        int c=sc.nextInt();
        if(a>b && a>c){
            System.out.println(a+"is greatest");
        }
        else if(b>a && b>c){
             System.out.println(b+"is greatest");
        }
        else{
            System.out.println(c+"is greatest");
        }

    }
}