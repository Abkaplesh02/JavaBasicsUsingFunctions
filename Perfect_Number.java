// Check if number is perfect number or not
import java.util.Scanner;

public class Perfect_Number {
    public static int Factor(int a){
        int Sum=0;
        for(int i=1;i<=a;i++){
            if(a%i==0){
                Sum+=i;
            }
        }
        return Sum;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to check perfect number :: ");
        int a=sc.nextInt();
        int Perf=Factor(a);
        if(Perf == (a*2)){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}
