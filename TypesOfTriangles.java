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
