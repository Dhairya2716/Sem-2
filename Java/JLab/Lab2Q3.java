import java.util.Scanner;

public class Lab2Q3 {
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter 1st number a: ");
      Double a = sc.nextDouble();
      System.out.print("Enter 2nd number b: ");
      Double b = sc.nextDouble();
      System.out.print("Enter the operator of your choice: ");
      String s = sc.next();
      double ans;
      if(s.equals("+")){
         ans=a+b;
         System.out.println(ans);
      }
     else if(s.equals("-")){
         ans=a-b;
         System.out.println(ans);
      }
       else if(s.equals("*")){
         ans=a*b;
         System.out.println(ans);
       }
       else if(s.equals("/")){
         ans=a/b;
         System.out.println(ans);
       }
       else{
         System.out.println("invalid error");
       }
       sc.close();
   } 
}
