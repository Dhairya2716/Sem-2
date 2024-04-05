import java.util.Scanner;

public class Lab4Q2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        sc.close();
        System.out.println("Enter a string");
        String str = "Dhairya Dudkiya";
        int i;
        int vowel = 0;
        int consonant = 0;
        for(i=0;i<str.length();i++){
            if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u'){
                vowel++;
            }       
            else if(str.charAt(i) >= 'a' && str.charAt(i) <='z'){
                consonant++;
            }
        }
        System.out.println("no. of vowels : "+ vowel);
        System.out.println("No. of consonant : "+ consonant);
    }
}