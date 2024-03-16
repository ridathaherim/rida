import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int num = sc.nextInt();
        int i=0,n=0,m=1,l;
        System.out.println(n+"\n"+m);
        for(i=0;i<=num;i++){
            l=n+m;
            n=m;
            m=l;
            System.out.println(l);
        }



        }
    }

