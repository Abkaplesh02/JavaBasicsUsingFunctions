//Print fibonacci term 
import java.util.Scanner;

public class Print_fibonacci_term {
    public static void Fib(int n){
        int a=0;
        int b=1;
        int count=1;
        while(count<n){
            int temp=a+b;
            a=b;
            b=temp;
            count++;
        }
        System.out.println("The required term is :: " + a);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter which term you want to print :: ");
        int a=sc.nextInt();
        Fib(a);
    }
}
