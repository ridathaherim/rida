import java.util.Scanner;

public class MaxNum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a>b && a>c){
            System.out.println(a+" is the maximum number");
        }
        if(b>a && b>c){
            System.out.println(b+" is the maximum number");
        }
        if(c>a && c>b){
            System.out.println(c+" is the maximum number");
        }

    }
}
