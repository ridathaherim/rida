/*
    1) Write a program to implement calculator in Java
   i) Take 2 double values as input
  ii) Take operator (+, 0, * /) as input
 iii) basing on the operator perform calculation of input values and display answer

I/P
Enter two numbers: 20 98
Enter an operator (+, -, *, /): /

O/P
20.0 / 98.0 = 0.2
    */
import java.util.Scanner;
public class Calc {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers:");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.println("Enter an operator:");
        char operator = sc.next().charAt(0);
        double sum = a+b;
        double multiplication = a*b;
        double division =a/b;
        double sub = a-b;
        if(operator=='+'){
            System.out.println(" sum of "+a+" and "+b+" is "+sum);
        }
        if(operator=='-'){
            System.out.println(" sub of "+a+" and "+b+" is "+sub);
        }
        if(operator=='*'){
            System.out.println("mul of "+a+" and "+b+" is "+multiplication);
        }
        if(operator=='/'){
            System.out.println("division of "+a+" and "+b+" is " +division);
        }

    }
}
