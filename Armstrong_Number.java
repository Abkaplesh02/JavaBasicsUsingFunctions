import java.util.Scanner;

public class Armstrong_Number {
    public static boolean Armstrong(int a){
        int b=a;
        int sum=0;
        while(a>0){
            int digit=a%10;
            sum=(digit*digit*digit)+sum;
            a=a/10;
        }
        if(sum==b){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number to check for armstrong number :: ");
        int a=sc.nextInt();
        System.out.println("The given number is armstrong number ::  " + Armstrong(a));
    }
}
