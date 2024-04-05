// import java.util.Scanner;
class Complex{
    int real;
    int imaginary;
    Complex(){
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter value of real no. : ");
        // int r = sc.nextInt();
        // this.real=r;
        // System.out.println("Enter value of img no. : ");
        // int img = sc.nextInt();
        // this.imaginary=img;
        // sc.close();
    }
    Complex(int x, int y){
        real = x;
        imaginary = y;
    }
    Complex addition(Complex c1, Complex c2){
        Complex C = new Complex();
        C.real = c1.real + c2.real;
        C.imaginary = c1.imaginary + c2.imaginary;
        return C;
    }
}
public class Lab5Q5{
    public static void main(String[] args){
        Complex c1 = new Complex(3,2);
        System.out.println("Complex number 1 : "+c1.real+"+ imaginary "+c1.imaginary);
        Complex c2 = new Complex(9,5);
        System.out.println("Complex number 1 : "+c2.real+"+ imaginary "+c2.imaginary);
        Complex c3 = new Complex();
        c3 = c3.addition(c1, c2);
        System.out.println("Sum of complex number is : "+c3.real+" and imaginary "+c3.imaginary);
    }
} 