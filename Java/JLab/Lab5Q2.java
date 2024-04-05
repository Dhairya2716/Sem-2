import java.util.Scanner;
class Time{
    int hour;
    int minute;
    Time(){
        this.hour = 12;
        this.minute = 45;
    }
    Time(int hour,int minute){
        this.hour = hour;   
        this.minute = minute;
    }
    void addition(Time t){
        int m = this.minute+t.minute;
        int h = this.hour+t.hour;
        if(m>59){
            m = m-60;
            h++;
        }
        System.out.println(h+":"+m);
    }
}
public class Lab5Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Time t1 = new Time();
        Time t2 = new Time(1,45);
        t1.addition(t2);
        sc.close();
    }
}
