import java.util.Scanner;

public class Box{
    int length;
    int breadth;
    int height;

    public Box(){
        Scanner sc = new Scanner(System.in);
       System.out.println("Enter height = ");
       height = sc.nextInt();
       System.out.println("Enter breadth = ");
       breadth = sc.nextInt();
       System.out.println("Enter length = ");
       length = sc.nextInt();
       sc.close();
    }

public void  printvolume(){
    int vol = height * length * breadth;
    System.out.println("Volume = "+vol);
}
}