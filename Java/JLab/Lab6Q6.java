class A{
    final int x = 5;
    A(){
        System.out.println(x);
    }
}
public class Lab6Q6{
    public static void main(String[] args){
        A a = new A();
        System.out.println(a.x);
    }
}