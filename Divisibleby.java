/*
Write a program to check whether a number is divisible by 5 and 11 or not
I/P
Enter a number: 55
*/
import java.util.Scanner;

public class Divisibleby {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        if(n%5==0 && n%11==0){
            System.out.println("yes,"+n+" is divisible by 5 and 11");
        }
        else{
            System.out.println("Not divisible by 5 and 11");
        }
    }
}
