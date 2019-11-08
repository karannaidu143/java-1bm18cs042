//Program to print the roots of a quadratic equation.

import java.util.*;
import java.lang.Math;
public class quadratic {
    public static void main(String[] args){
        int a,b,c;
        double d;
        Scanner sc=new Scanner(System.in);
        System.out.println("Quadratic Equations are of the form ax^2 + bx + c = 0\n Enter the value of coefficients of the equation:.\nEnter the value of a-");
        a=sc.nextInt();
        System.out.println("Enter the value of b-");
        b=sc.nextInt();
        System.out.println("Enter the value of c-");
        c=sc.nextInt();
        d = b*b - 4*a*c;
        if(d<0)
            System.out.println("This equation has no real roots");
        else if(d==0){
           double r1= -b/(2*a);
           System.out.printf("The roots are equal, and they are %.4f", r1);
        }
        else if(d>0){
            double r1, r2;
            r1=(-b+Math.sqrt(d))/(2*a);
            r2=(-b-Math.sqrt(d))/(2*a);
            System.out.printf("The roots are real and unequal\nThey are %.4f and %.4f", r1, r2);
        }
    }
}
