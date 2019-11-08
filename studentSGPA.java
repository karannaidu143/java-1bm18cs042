//Program to calculate the SGPA of a student
//1BM18CS036
//This program won't work in cmd and Powershell (They return runtime error) as colors are not supported by them 
import java.util.*;
class Stu{
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    String usn, name;
    int subs;
    double sgpa;
    double cre[] = new double[100];
    double marks[] = new double[100];
    Stu(int n){
        //int cre[] = new int[n];
        //int marks[] = new int[n];
        usn = "";
        name = "";
        subs = 0;
        sgpa = 0.0;
    }
    void input(int a){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Name of the Student " + ANSI_RED + (a+1) + ANSI_RESET + " - ");
        name = s.next();
        System.out.println("Enter the USN of " + ANSI_RED + name + ANSI_RESET + " - ");
        usn = s.next();
        System.out.println("Enter the Number of Courses of " + ANSI_RED + name + ANSI_RESET + " - ");
        subs = s.nextInt();
        for (int i = 0 ; i < subs ; i++){
            System.out.println("Enter the Credits and Marks" + ANSI_PURPLE + "(0-100)" + ANSI_RESET + " of " + ANSI_RED + "Subject " + (i+1) + "-" + ANSI_RESET);
            cre[i] = s.nextDouble();
            marks[i] = s.nextDouble();
        }
    }
    double getgp(double x){
        if (x<40){
            return 0;
        }
        else if ((x>=40)&&(x<45)){
            return 4;
        }
        else if ((x>=45)&&(x<50)){
            return 5;
        }
        else if ((x>=50)&&(x<60)){
            return 7;
        }
        else if ((x>=60)&&(x<75)){
            return 8;
        }
        else if ((x>=75)&&(x<90)){
            return 9;
        }
        else if ((x>=90)&&(x<100)){
            return 10;
        }
        return 0;
    }
    void cal(){
        double sum = 0.0;
        double creditssum = 0.0;
        for (int j = 0 ; j < subs ; j++){
            sum += cre[j] * this.getgp(marks[j]);
            creditssum += cre[j];
        }
        sgpa = sum/creditssum;
    }
    void display(){
        System.out.print(ANSI_PURPLE + "\nSGPA of " + name + "(" + usn + ")" + " is - " + ANSI_RED);
        System.out.printf("%4.2f%n", sgpa);
        System.out.print(ANSI_RESET + "\n");
    }
}
class student {
    public static void main(String[] args){
        int n;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Number of Students");
        n = s.nextInt();
        Stu ele = new Stu(n);
        //System.out.println(ele.name);
        //System.out.println(ele.cre[0]);
        System.out.println("Entering the details of Students-");
        for (int k = 0 ; k < n ; k++){
            ele.input(k);
            ele.cal();
            ele.display();
        }
    }
}
