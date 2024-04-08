import java.io.*;
import java.util.Scanner;
public class Lab10Q1 {
  public static void main(String[] args) {
    int nextline = 0;
    int countchar=0;
    int  countword=0;
    try {
      File file = new File("read.txt");
      Scanner sc = new Scanner(file);
      String arr[];
      while(sc.hasNextLine()) {
        String line = sc.nextLine();
        // FileWriter f = new FileWriter(file);
        // f.write("Hello");
        // f.close();
        countchar+=line.length();
        arr = line.split(" ");
        for(int i=0;i<arr.length;i++){
            countword++;
        }
        nextline++;
      }
      System.out.println("Total Number of Lines: " + nextline);
      System.out.println("number character : "+countchar);
      System.out.println("number of words : "+ countword);
      System.out.println(file.canRead() ? "yes" : "no");
      System.out.println(file.canWrite() ? "yes" : "no");
      sc.close();
    } catch (Exception e) {
      e.getStackTrace();
    }
  }
}