/*Write a program to find the x^n
        I/P
        Enter the Base Number :2
        Enter the Power Number :5

        O/P
        Result: 32
*/
import java.util.Scanner;
public class Root {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int base = sc.nextInt();
        System.out.println("Enter power :");
        int power = sc.nextInt();
        int root=1;
        for(int i=1;i<=power;i++){
            root*=base;
        }
        System.out.println(root);
    }
}
