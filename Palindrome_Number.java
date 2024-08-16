import java.util.Scanner;

public class Palindrome_Number {
    public static boolean Pal(int a){
        int b=a;
        int Rev=0;
        while(a>0){
            int digit=a%10;
            Rev=Rev*10+digit;
            a=a/10;
        }
        if(Rev==b){
            return true;
        }
        else{
            return  false;
        }

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to check for palindrome number :: ");
        int a=sc.nextInt();
        System.out.println("The given number is palindrome :: " + Pal(a));
    }
}
