import java.util.Random;
import java.util.Scanner;

public class RandomNumbers {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[]=new int[10];
        for(int i=0;i<=arr.length;i++){
            Random rand = new Random();
            int randint=rand.nextInt(100);
            System.out.println(randint);
        }

    }}

