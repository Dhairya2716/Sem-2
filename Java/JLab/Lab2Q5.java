import java.util.Scanner;

public class Lab2Q5 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter value of F: ");
        double F=sc.nextDouble();
        Double C;
        C = (F-32)*(5/9.0);
        System.out.println(C);
        sc.close();
    }
}
