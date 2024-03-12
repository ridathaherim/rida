/*
2) Take input only ranging between 1 and 7, Display name of the day basing on the input value using Switch-case 

Ex.
I/P
Enter a number: 2

O/P
Monday
*/

import java.util.Scanner;

public class Daysusingswitch {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = sc.nextInt();
        switch(n){
            case 1 : System.out.println("SUNDAY");break;
            case 2 : System.out.println("MONDAY");break;
            case 3 : System.out.println("TUESDAY");break;
            case 4 : System.out.println("WEDNESDAY");break;
            case 5 : System.out.println("THURSDAY");break;
            case 6 : System.out.println("FRIDAY");break;
            case 7 : System.out.println("SATURDAY");break;
            default : System.out.println("Invalid input");

        }

    }
}
