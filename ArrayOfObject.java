
import java.util.Scanner;

class Employee{

    int id;
    String name;
    double salary;

    public Employee(int id,String name,double salary) {
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
    

    void display(){
        System.out.println("id : "+id);
        System.out.println("name : "+name);
        System.out.println("salary : "+salary);

    }

    void incrementSalary(double percent){
    salary = salary + (salary * percent / 100);
}

}
class ArrayOfObject{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of elements");
        int n=sc.nextInt();
        Employee[] emp=new Employee[n];
        for(int i=0;i<emp.length;i++){
            System.out.println("enter the id");
            int id=sc.nextInt();
            System.out.println("enter the name");
            String name=sc.next();
            System.out.println("enter the salary");
            double salary=sc.nextDouble();
            emp[i]=new Employee(id, name, salary);
        }
        System.out.println("EMPLOYEE DETAILS");
        for(int i=0;i<emp.length;i++){
            emp[i].display();
            System.out.println(" ");
        }
       
        int maxIndex=0;
         for(int i=1;i<emp.length;i++){
            if(emp[i].salary>emp[maxIndex].salary){
                maxIndex=i;
            }
        }
        System.out.println("employee with highest salary is ");
        emp[maxIndex].display();
        for(int i=0;i<emp.length;i++){
    emp[i].incrementSalary(10);
}
for(int i=0;i<emp.length;i++){
            emp[i].display();
            System.out.println(" ");
        }
        
        sc.close();


    }
}