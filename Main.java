import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void swap(int a, int b){
        Scanner sc=new Scanner(System.in);
        int temp=a;
        a=b;
        b=temp;
        System.out.println(a + "   and   " +  b);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in );
        int a=10;
        int b=20;
        swap(10,20);
        System.out.println(a + "    and    " + b);
        }
    }
