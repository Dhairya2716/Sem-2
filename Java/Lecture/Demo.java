import java.util.Scanner;

public class Demo{
    public static void main(String[] args){
        System.out.print("Please enter number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean Isprime = true;
        for(int i = 2 ; i < n ; i++){
            if(n % i == 0){
                Isprime = false;
                break;
            }
        }
        if(Isprime){
            System.out.println("NUmber is prime");
        }
        else{
            System.out.println("Number is not a prime");
        }
        sc.close();
    }
}