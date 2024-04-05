import java.util.Scanner;
class Member {
    String name;
    int age;
    String phonenumber;
    String address;
    int salary;
    Member(String name,int age,String phonenumber,String address,int salary){
        this.name = name;
        this.age = age;
        this.phonenumber = phonenumber;
        this.address = address;
        this.salary = salary;
    }
    void printSalary(){
        System.out.println("Salary:"+this.salary);
    }
    void printDetails(){
        System.out.println("\nName:"+this.name);
        System.out.println("Age:"+this.age);
        System.out.println("Phone no.:"+this.phonenumber);
        System.out.println("Address:"+this.address);
        printSalary();
    }
}   

class Employee extends Member{
    String spec;
    Employee(String name,int age,String phonenumber,String address,int salary,String spec){
    super(name, age,phonenumber,address,salary);
    this.spec = spec;
    }
    void printDetails(){
        super.printDetails();
        System.out.println("Specialization:"+this.spec);
    }
}

class Manager extends Member{
        String department;
        Manager(String name,int age,String phonenumber,String address,int salary,String department){
            super(name,age,phonenumber,address,salary);
            this.department = department;
        }
            void printDetails(){
                super.printDetails();
                System.out.println("Department:"+this.department);
            }  
        }
public class Lab6Q3{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name of member:");
        String a = sc.nextLine();
        System.out.println("Enter Age:");
        int b = sc.nextInt();

        sc.nextLine();
        System.out.println("Enter phone number:");
        String c = sc.nextLine();
        System.out.println("Enter Address:");
        String d = sc.nextLine();
        System.out.println("Enter Salary:");
        int e = sc.nextInt();

        sc.nextLine();
        System.out.println("Enter Department:");
        String f = sc.nextLine();
        
        Manager mc = new Manager(a,b,c,d,e,f);
        mc.printDetails();
        
        System.out.println("\nEnter name of member:");
        String g = sc.nextLine();
        System.out.println("Enter Age:");
        int h = sc.nextInt();

        sc.nextLine();
        System.out.println("Enter phone number:");
        String i = sc.nextLine();
        System.out.println("Enter Address:");
        String j = sc.nextLine();
        System.out.println("Enter Salary:");
        int k = sc.nextInt();

        sc.nextLine();  
        System.out.println("Enter Specialization:");
        String l = sc.nextLine();
        Employee as = new Employee(g,h,i,j,k,l);
        as.printDetails();
    }
}