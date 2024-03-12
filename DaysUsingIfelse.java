import java.util.Scanner;

public class DaysUsingIfelse {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = sc.nextInt();
        if (n == 1) {
            System.out.println("SUNDAY");
        }
        if (n == 2) {
            System.out.println("MONDAY");
        }
        if (n == 3) {
            System.out.println("TUESDAY");
        }
        if (n == 4) {
            System.out.println("WEDNESDAY");
            if (n == 5) {
                System.out.println("THURSDAY");
            }
            if (n == 6) {
                System.out.println("FRIDAY");
            }
            if (n == 7) {
                System.out.println("SATURDAY");
            } else {
                System.out.println("Invalid input");
            }

        }
    }
}