import java.util.Scanner;
public class Lab4Q7
{
public static void main(String m[])
{
char c;
int i,j;
Scanner in = new Scanner(System.in);

String s;
System.out.println("Enter A String::");
s=in.next();
int k;
for(i=0;i<s.length();i++)
{
for(k=0;k<s.length();k++) {
            System.out.print(" ");
          }

for(j=0;j<=i;j++)
{

c=s.charAt(j);
System.out.print(c+" ");
}
System.out.println(" ");
}
in.close();
}
}
