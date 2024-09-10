// Leap year 
import java.util.Scanner;
// This is code to check if given year is leap year or not

public class Leap_Year {
    public static boolean Leap(int a){

        if(a%4==0){
            if(a%100==0){
                if(a%400==0){
                    return true;
                }
                else{
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the year to check for leap year :: ");
        int a=sc.nextInt();
        System.out.println("The given year is leap year :: " + Leap(a));
    }
}
