
/*Write a program to find the factorial value of any number
        I/P
        Enter a number: 5
        Factorial: 120
*/

import java.util.Scanner;

public class Factorial {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int i = sc.nextInt();
        int fact=1;
        for(int j=1;j<=i;j++){
            fact = fact*j;


        }
        System.out.println(fact);


    }
}
