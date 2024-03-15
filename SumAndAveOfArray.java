/*Write a program to calculate the sum and average value of array elements
        I/P
        1 2 3 4 5

        O/P
        Sum: 15
        Average: 3.0
*/
import java.util.Scanner;

public class SumAndAveOfArray {
    public static void main(String args[]) throws ArrayIndexOutOfBoundsException{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of index :");
        int j=sc.nextInt();
        int arr[] = new int[j];
        System.out.println("Enter array elements :");
        int sum=0;
        double avg;
        for(int i=0;i<j;i++){
            arr[i]=sc.nextInt();
            sum += arr[i];
        }
        System.out.println(sum);
        avg=sum/j;
        System.out.println(avg);

    }
}
