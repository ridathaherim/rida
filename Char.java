/*
Write a program to input any character and check whether it is alphabet, digit or special character

I/P
Enter a value: m

O/P
m is a an alphabet

I/P
Enter a value: 8

O/P
8 is a a digit
*/
import java.util.Scanner;

public class Char {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a char :");
        char c = sc.next().charAt(0);
        if(c>='a'&&c<='z'||c>='A'&&c<='Z'){
            System.out.println(c+" is an alphabet");
        }
        if(c>='0' && c<='9'){
            System.out.println(c+" is a number");
        }
        else{
            System.out.println(c+" is a special chracter");
        }
    }
}
