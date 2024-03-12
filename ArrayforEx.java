import java.util.Scanner;

public class ArrayforEx {
    public static void main(String []args){
        int i;
        int arr[]=new int[15];
        Scanner s= new Scanner(System.in);
        System.out.println("Enter 15 numbera :");
        for(i=1;i<15;i++){
            arr[i]=s.nextInt();
        }
        for(i=1;i<15;i++){
            System.out.println("Allocation in "+i+" is "+arr[i]);
        }
    }
}
