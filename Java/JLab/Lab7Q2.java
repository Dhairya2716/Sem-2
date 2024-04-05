interface A{
    void d();
}
interface A1 extends A{
    void e();
}
interface A2 extends A{
    void f();
}
interface A12 extends A1,A2{
    void g();
}
class B implements A12{
   public void d(){
    System.out.println("D");
    }
    public void e(){
        System.out.println("E");
    }
    public void f(){
        System.out.println("F");
    }
    public void g(){
        System.out.println("G");
    }
}
public class Lab7Q2 {
    public static void main(String[] args) {
        B alpha = new B();
        alpha.d();
        alpha.e();
        alpha.f();
        alpha.g();
    }
}