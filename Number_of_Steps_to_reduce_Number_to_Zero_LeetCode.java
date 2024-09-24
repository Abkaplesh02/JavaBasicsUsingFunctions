import java.util.Scanner;

public class Number_of_Steps_to_reduce_Number_to_Zero_LeetCode {
    public static int Step(int n){
        int count=0;
        while(n>0){
            if(n%2==0){
                n=n/2;
            }
            else{
                n=n-1;
            }
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value to count::: ");
        int a=sc.nextInt();
        System.out.println("The count number is :: " + Step(a));
    }
}
