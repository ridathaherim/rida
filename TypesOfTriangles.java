/*8) Write a program to check whether the triangle is equilateral, isosceles or scalene triangle
Logic:
If s1, s2 and s3 are 3 sides of the triange
when all 3 sides are equal -> Equilateral Triangle
When any 2 sides are euqal -> Isosceles Triangle
Otherwise Scalene Triangle

I/P
Enter 3 sides of the triangle: 60 45 45

O/P
Isosceles Triangle.
*/
import java.util.Scanner;

public class TypesOfTriangles {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 sides of triangle :");
        int s1 = sc.nextInt();
        int s2 = sc.nextInt();
        int s3 = sc.nextInt();
        if(s1==s2 && s1==s3){
            System.out.println("Equilateral Triangle ");
        }
        if((s1==s2 ||s1==s3 || s2==s3) && s1!=s3 || s2!=s3){
            System.out.println("Isosceles Triangle");
        }
        if(s1!=s2 && s2!=s3){
            System.out.println("Scalene Triangle");
        }
    }
}
