/*Write a program print odd numbers from a size 6 array, if no odd numbers found print "No odd numbers found" message
        I/P
        1 2 3 4 5 6

        O/P
        Odd Numbers found are: 1 3 5

        I/P
        2 4 6 80 96 44

        O/P
        Odd Numbers found are: No odd numbers found
*/
import java.util.Scanner;

public class FindOddNumbersArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter index :");
        int j = sc.nextInt();
        int arr[] = new int[j];
        int i;
        System.out.println("Enter array values :");
        for (i = 0; i < j; i++) {
            arr[i] = sc.nextInt();
        }
        for (i = 0; i < j; i++) {
            if (arr[i] % 2 != 0) {
                System.out.println("Odd number: "+arr[i]);
            } else {
                System.out.println("No odd numbers ");
            }
        }
    }

}