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
