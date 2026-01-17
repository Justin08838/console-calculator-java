import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the first Number ");
        long a=in.nextLong();
        System.out.println("Enter the operation like +,-,*,/ ");
        char c=in.next().charAt(0);
        System.out.println("Enter the second Number ");
        long b=in.nextLong();
        if(c=='+'){
            System.out.print("the output is the "+(a+b));
        }else if(c=='-'){
            System.out.print("the output is the "+(a-b));
        }else if(c=='*'){
            System.out.print("the output is the "+(a*b));
        }else if(c=='/'){
            if(b==0){
                System.out.print("Invalid input");
            }else{
                System.out.print("the output is the "+(a/b));
            }
        }else{
            System.out.print("this is the invalid operator");
        }
        in.close();
     }
}
