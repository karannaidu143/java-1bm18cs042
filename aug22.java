import java.util.*;
import java.io.PrintStream;
class employee{
    Scanner sc=new Scanner(System.in);
    String name, empnum;
    double basic, gs, it, ns;
    void input(){
        System.out.println("Enter the name of the Employee-");
        name = sc.next();
        System.out.println("Enter the Employer number-");
        empnum = sc.next();
        System.out.println("Enter the Basic salary-");
        basic = sc.nextDouble();
        ent=1;
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
        for(int i=0; i<n; i++){
            emp[i].input();
            emp[i].calc();
            emp[i].display();
            System.out.println("Do you want to input again?\n(1 for Yes,0 for No)");
            int choice1;
            choice1=s.nextInt();
            if (choice1==1){
                emp[i].input();
                emp[i].calc();
                emp[i].display();
            }
        }
    }
}