import java.util.Scanner;

public class Lab3Q1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks of maths: ");
        double m = sc.nextDouble();
         System.out.print("Enter marks of physics: ");
        double p = sc.nextDouble();
         System.out.print("Enter marks of english: ");
        double e = sc.nextDouble();
         System.out.print("Enter marks of OOPJ: ");
        double o = sc.nextDouble();
         System.out.print("Enter marks of WD: ");
        double w = sc.nextDouble();
        double avg;
        avg = (m+p+e+o+w)/4;
        System.out.println(avg);
        if(avg>=60){
            System.out.println("Congrats! you got First Division");
        }
        else if(avg>50 && avg<59){
            System.out.println("Congrats! you got Second Divison");
        }
        else if(avg>40 && avg<49){
            System.out.println("you got Third Division");
        }
        else{
            System.out.println("Fail");
        }
        sc.close();
    }
}
