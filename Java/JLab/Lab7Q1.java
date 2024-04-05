abstract class Vegetable{
    String color;
    String vegname;
    Vegetable(String color, String vegname){
      this.color = color;
      this.vegname = vegname;
    }
    public String toString(){
      return "Color of "+vegname+" is : "+color; 
    }
}
   class Potato extends Vegetable{
       Potato(String vegname, String color){
         super(color,vegname);
       }
   }
   class Brinjal extends Vegetable{
       Brinjal(String vegname, String color){
        super(color,vegname);
       }
   }
   class Tomato extends Vegetable{
       Tomato(String vegname,String color){
        super(color,vegname);
       }
   }
   public class Lab7Q1{
    public static void main(String [] args){
     Potato p = new Potato("Potato","Brownish-yellow");
     Brinjal b = new Brinjal("Brinjal","Purple");
     Tomato t = new Tomato("Tomato","red")   ;
     System.out.println(p);
     System.out.println(b);
     System.out.println(t);
       }
   }