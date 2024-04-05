public class Lab6Q7{
    public static void main(String[] args){
        Alok a = new Alok();
        // System.out.println(a);
    }
}
class DJ{
    int x = 5;
    DJ(){
        System.out.println("Value of x is : "+x);
    }
}
class Alok extends DJ{
    Alok(){
        int sup = super.x;
        System.out.println(sup);
    }
}
