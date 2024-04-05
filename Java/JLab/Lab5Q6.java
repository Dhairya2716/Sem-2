class object{
    static int count = 0;
    object(){
        count++;
    }
}
public class Lab5Q6 {
    public static void main(String[] args) {
        object o1 = new object();
        object o2 = new object();
        System.out.println(o2.count);
        object o3 = new object();
        System.out.println(o1.count);
        System.out.println(o3.count);
        System.out.println(object.count);
    }
}