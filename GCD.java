// Check GCD of 2 number 
import java.util.Scanner;

public class GCD {
    public static int HCF(int a, int b){
        while(a>0 && b>0 ){
            if(a%b==0){
                return b;
            }
            int temp=a%b;
            a=b;
            b=temp;
        }
        return 1;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbers to check GCD :: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int HCFA=HCF(a,b);
        System.out.println("The GCD of numbers is :: " + HCFA);
    }
}
