/*
Write a program to input marks of five subjects Physics, Chemistry, Biology, Mathematics and Computer. Calculate percentage and grade according to following:
Percentage >= 90% : Grade A
Percentage >= 80% : Grade B
Percentage >= 70% : Grade C
Percentage >= 60% : Grade D
Percentage >= 40% : Grade E
Percentage < 40% : Grade F

I/P
Enter The Five Subject Marks :
65
89
82
95
85

O/P
Total :416
Percentage :83.0
Grade B
*/
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
