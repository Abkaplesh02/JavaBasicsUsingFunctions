// Fibonacci series
import java.util.Scanner;

public class Fibonacci_series {
    public static boolean Fibonacci(int n){
        int a=0;
        int b=1;
        while(n>=a){
            if(a==n){
                return true;
            }
            int temp=a+b;
            a=b;
            b=temp;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter which term you want to check :: ");
        int a=sc.nextInt();
        System.out.println("The given term is part of fibonacci :: " + Fibonacci(a));
    }
}
