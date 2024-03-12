import java.util.Scanner;

public class StudPercentageAndGrade {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String studname,Grade;
        int Physics,Chemistry,Biology,Mathematics,Computer,total;
        double Percentage;
        System.out.println("Enter name :");
        studname = sc.next();
        System.out.println("Enter Marks :");
        Physics = sc.nextInt();
        Chemistry = sc.nextInt();
        Biology = sc.nextInt();
        Mathematics = sc.nextInt();
        Computer = sc.nextInt();
        total=Physics+Chemistry+Biology+Mathematics+Computer;
        System.out.println("Total marks of student :"+total);
        Percentage = total/5;
        System.out.println("Percentage :"+Percentage);
        if(Percentage>=90){
            System.out.println("Grade A");
        }
        if(Percentage>=80 && Percentage<=90){
            System.out.println("Grade B");
        }
        if(Percentage>=70 && Percentage<=80){
            System.out.println("Grade C");
        }
        if(Percentage>=60 && Percentage<=70){
            System.out.println("Grade D");
        }
        if(Percentage>=40 && Percentage<=60){
            System.out.println("Grade E");
        }
        if(Percentage<=40){
            System.out.println("Grade F");
        }


    }
}
