//Program to Calculate Net Salary of employers and Display them
//1BM18CS036
//This program won't work in cmd and Powershell (They return runtime error) as colors are not supported by them 
import java.util.*;
class TIME{
    public static final String ANSI_RESET = "\u001B[0m"; // ANSI Escape code to reset the IO Output color to default
    public static final String ANSI_RED = "\u001B[31m";  // ANSI Escape code to change the IO Output color to Red
    int h, m, s;
    TIME(){
        h = 0;
        m = 0;
        s = 0;
    }
    void currentTIME(int x, int y, int z){
        h = x;
        m = y;
        s = z;
    }
    void add(int a,  int b, int c){
        s += c;
        m = m + b + (s/60);
        s = s%60;
        h = h + a + (m/60);
        m = m%60;
        h = h%24;
    }
    void display(){
        System.out.print(ANSI_RED + "The Hour is    -");
        System.out.printf("%4d%n", h);
        System.out.print("The Minute is  -");
        System.out.printf("%4d%n", m);
        System.out.print("The Second is  -");
        System.out.printf("%4d%n", s);
        System.out.print(ANSI_RESET);
    }
}
class timeDemo{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        TIME t=new TIME();
        int hh, mm, ss;
        System.out.println("Enter Hours, Minutes, Seconds\n(Separated by whitespace)-");
        hh = sc.nextInt();
        mm = sc.nextInt();
        ss = sc.nextInt();
        t.currentTIME(hh,mm,ss);
        int choice, cont;
        do {
            System.out.println("Choose the operation to perform-");
            System.out.println("1. Advance (Add time)");
            System.out.println("2. Display the Time");
            System.out.println("3. Reenter Current Time");
            choice=sc.nextInt();
            switch(choice){
                case 1:{
                    System.out.println("Enter the time of advancing-");
                    int x = sc.nextInt();
                    int y = sc.nextInt();
                    int z = sc.nextInt();
                    t.add(x, y, z);
                    t.display();
                    break;
                }
                case 2:{
                    t.display();
                    break;
                }
                case 3:{
                    System.out.println("Enter the new Time-");
                    int p = sc.nextInt();
                    int q = sc.nextInt();
                    int r = sc.nextInt();
                    t.currentTIME(p, q, r);
                    break;
                }
                default:System.out.println("Invalid");
            }
            System.out.println("Do you want to repeat the operations?\n(1 for Yes) ");
            cont = sc.nextInt();
        }while(cont==1);
    }
}
