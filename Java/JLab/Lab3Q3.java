import java.util.Scanner;
public class Lab3Q3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of a: ");
        int a = sc.nextInt();
        System.out.print("Enter value of b: ");
        int b = sc.nextInt();
        System.out.print("Enter value of c: ");
        int c = sc.nextInt();
        if(a>b){
            if(a>c){
                System.out.println("A is the largest number");
            }
            else{
                System.out.println("C is the largest number");
            }
        }
        if(b>a){
            if(b>c){
                System.out.println("B is the largest number");
            }
            else{
                System.out.println("C is the largest number");
            }
        }
        sc.close();
    }
}