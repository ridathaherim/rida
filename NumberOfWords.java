import java.util.Scanner;

public class NumberOfWords {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a string :");
        String s=sc.nextLine();
        System.out.println("length of the string :"+s.length());
        String sarr[]=s.split(" ");
        int i;
        for(i=0;i<sarr.length;i++){
            System.out.println(sarr[i]);
            }
        System.out.println("Number of words :"+i);

        }

    }
