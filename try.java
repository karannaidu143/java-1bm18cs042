import java.util.*;
import java.io.PrintStream;
class employee{
    Scanner sc=new Scanner(System.in);
    String name, empnum;
    private int ent=0;
    double basic, gs, it, ns;
    void input(){
        if(ent==0) {
            System.out.println("Enter the name of the Employee-");
            name = sc.next();
            System.out.println("Enter the Employer number-");
            empnum = sc.next();
            System.out.println("Enter the Basic salary-");
            basic = sc.nextDouble();
            ent=1;
        }
        else {
            int inp;
            System.out.println("Employer details are already entered.\n Do you want to enter the details again?(Enter 1 for Yes, Enter 0 for No)-");
            inp = sc.nextInt();
            if (inp == 1) {
                ent = 0;
                System.out.println("Call the input function again");
            }
        }
    }
    void calc(){
        gs=basic+(0.75*basic);
        it=gs*0.3;
        ns=gs-it;
    }
    void display(){
        System.out.println("Employer name is");
        System.out.printf("%50s", name);
        System.out.println("Employer number of " + name + " is -");
        System.out.printf("%50s", empnum);
        System.out.println("Basic Salary of " + name + " is -");
        System.out.printf("%50.3f", basic);
        System.out.println("Dearness Allowance of "+ name + " is-");
        System.out.printf("%50.3f", 0.75*basic);
        System.out.println("Income Tax is -");
        System.out.printf("%50.3f",it);
        System.out.println("__________________________________________________");
        System.out.println("Net Salary of " + name + " is - ");
        System.out.printf("%50.3f", ns);
    }
}
class aug22 {
    public static void main(String[] args){
        int n, choice;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number of employees- ");
        n=s.nextInt();
        employee emp[]=new employee[n];
        System.out.println("Inputting data-\n");
        for(employee x:emp){
            x.input();
            x.calc();
            x.display();
            System.out.println("Do you want to input again?\n(1 for Yes,0 for No)");
            int choice1;
            choice1=s.nextInt();
            if (choice1==1){
                x.input();
                x.calc();
                x.display();
            }
        }
    }
}