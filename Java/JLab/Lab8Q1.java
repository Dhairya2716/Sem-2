class MyE extends Exception{
    MyE(String s){
        super(s);
    }
}

public class Lab8Q1 {
    public static void main(String[] args) {
        try{
            int x = Integer.parseInt(args[0]);
            int y = Integer.parseInt(args[1]);
            if(x<0 || y<0){
                throw new MyE("Number cannot be negative");
            }
            int z = x*y;
            System.out.println(z);
        }
        catch(NumberFormatException e){
            System.out.println("Only Integer value allowed");
        }
        catch(Exception e){
            System.out.println(e);
            System.out.println("you are wrong");
            // e.printStackTrace();
        }
    }
}