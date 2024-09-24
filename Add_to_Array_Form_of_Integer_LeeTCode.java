import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Add_to_Array_Form_of_Integer_LeeTCode {
    public static ArrayList<Integer> ArrayForm(int arr[], int n){
        ArrayList<Integer> List1=new ArrayList<>();

        int i=arr.length-1;
        while(i>=0 || n>0){
            if(i>=0){
                n=n+arr[i];
                i--;
            }
            List1.add(0,n%10);
            n=n/10;
        }
        return List1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Size of array :: ");
        int a=sc.nextInt();
        int arr[]=new int[a];
        System.out.println("Enter elements of array :: ");
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(ArrayForm(arr,1));
    }
}
