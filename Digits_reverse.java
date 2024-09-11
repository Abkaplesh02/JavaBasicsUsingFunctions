// Digits reverse java
import java.util.Scanner;

public class Digits_reverse {
    public static int Reverse(int a){
        int Rev=0;
        while(a>0){
            int digit=a%10;
            Rev=Rev*10+digit;
            a=a/10;
        }

        return Rev;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to reverse :: ");
        int a= sc.nextInt();
        int Rev=Reverse(a);
        System.out.println("The reversed number is :: " + Rev);
    }
}
