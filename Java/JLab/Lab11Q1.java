import java.io.*;
public class Lab11Q1 {
    public static void main(String[] args) {
        String filename = "abc.txt";
        try{
            BufferedWriter b  = new BufferedWriter(new FileWriter(filename));
            
            b.write("Karan,-5\n");
            b.write("Dhairya,18\n");
            b.write("Meet,18\n");
            b.close();
            System.out.println("Data Written Successfully");
        }
        catch(Exception e){
            e.printStackTrace();
        }

        try{
            BufferedReader br = new BufferedReader(new FileReader(filename));
            String line;
            while((line =  br.readLine())!=null){
                String name_age [] = line.split(",");
                String name = name_age[0];
                int age = Integer.parseInt(name_age[1]);
                Student st = new Student(name, age);
                System.out.println(st);
            }
                br.close();
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }
}

class Student{
    String name;
    int age;
    Student(String name , int age){
        this.name= name;
        this.age=age;
    }

    public String toString(){
        return "Name : "+name+" , Age : "+age;
    }
}