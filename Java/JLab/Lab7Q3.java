interface Transport{
    void deliver();
}
abstract class animal{
   abstract void type();
}
class donkey extends animal implements Transport{
    public void type(){
        System.out.println("not Wild");
    }
    public void deliver(){}
}
class tiger extends animal{
    void type(){
        System.out.println("Wild");
    }
}
class deer extends animal{
    void type(){
        System.out.println("not Wild");
    }
}
class camel extends animal implements Transport{
    void type(){
        System.out.println("not Wild");
    }
    public void deliver(){}
}
public class Lab7Q3 {
    public static void main(String[] args) {
        animal a[] = new animal[4];
        a[0] = new tiger();
        a[1] = new camel();
        a[2] = new deer();
        a[3] = new donkey();
    }
}