/*
Write a program to input basic salary of an employee and calculate its Gross salary according to following:

Basic Salary <= 10000 : HRA = 20%, DA = 80%
Basic Salary <= 20000 : HRA = 25%, DA = 90%
Basic Salary > 20000 : HRA = 30%, DA = 95%

I/P
Enter The Basic Salary :25000

O/P
Gross Salary : 56250.0
*/
import java.util.Scanner;

public class GrossSalary {
    public static void main(String args[]){
        int BasicSalary;
        double GrossSalary;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Salary :");
        BasicSalary = sc.nextInt();
        if(BasicSalary<=10000){
            GrossSalary = BasicSalary+0.2*BasicSalary+0.8*BasicSalary;
            System.out.println("GrossSalary :"+GrossSalary);
        }
        if(BasicSalary<=20000){
            GrossSalary = BasicSalary+0.25*BasicSalary+0.9*BasicSalary;
            System.out.println("Gross Salary :"+GrossSalary);
        }
        if(BasicSalary>20000){
            GrossSalary = BasicSalary+0.3*BasicSalary+0.95*BasicSalary;
            System.out.println("GrossSalary :" +GrossSalary);
        }



    }
}
