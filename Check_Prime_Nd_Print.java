import java.util.Scanner;

public class Check_Prime_Nd_Print {
    public static boolean CheckPrime(int a){
        for(int i=2;i<=a/2;i++){
            if(a%i==0){
                return false;
            }
        }
        return true;

    }

    public static void PrintPrime(int a){
        if(a==0 && a==1){
            return;
        }

        for(int i=2;i<=a;i++){
            if(CheckPrime(i)){
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number upto which to print prime numbers :: ");
        int a=sc.nextInt();
        PrintPrime(a);
    }
}
