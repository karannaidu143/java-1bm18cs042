//Program to print nth term of the Fibonacci series
import java.util.*;
public class fibonacci {
    public static void main(String[] args){
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the series(value of n)-");
        n=sc.nextInt();
        int a0=0,a1=1;
        int a = 1;
        for(int i=1;i<n;i++){
            a=a0+a1;
            a0=a1;
            a1=a;
        }
        System.out.println("The " + n + "th number in the Fibonacci series is - " + a);
        System.out.println("End of series");
    }
}
