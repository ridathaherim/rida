import java.util.Scanner;

public class TernaryOperator {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n;
        String value;
        System.out.println("Enter a number");
        n=sc.nextInt();
        value = n==1? "SUNDAY":
                n==2? "MONDAY":
                        n==3? "TUESDAY":
                                n==4? "WED":
                                        n==5? "THUR":
                                                n==6? "FRI": "Sat";
        System.out.println(value);
    }
}
