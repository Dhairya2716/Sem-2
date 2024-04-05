class A extends Thread{
    synchronized public void run(){
        for(int i=0;i<20;i+=2){
            System.out.println(i);
            try{
                sleep(1000);
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
        
    }
}

class B extends Thread{
   synchronized public void run(){
        for(int i=1;i<20;i+=2){
            System.out.println(i);
            try{
                sleep(1000);
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
        
    }
}

public class Lab9Q2 {
    synchronized public static void main(String[] args){
        A a = new A();
        B b = new B();
        a.start();
        // try{
        //     a.join();
        // }
        // catch(Exception e)
        // {
        //     System.out.println(e);
        // }
        b.start();
    }
}
