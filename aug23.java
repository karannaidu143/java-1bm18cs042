import java.util.*;
import java.io.PrintStream;
class employee{
    Scanner sc=new Scanner(System.in);
    String name, empnum;
    double basic, gs, it, ns;
    void employee(){
		name="";
		empnum="";
		basic=0;
		gs=0;
		it=0;
		ns=0;
	}
    void input(){
        System.out.println("Enter the name of the Employee-");
        name = sc.next();
        System.out.println("Enter the Employer number-");
        empnum = sc.next();
        System.out.println("Enter the Basic salary-");
        basic = sc.nextDouble();
    }
    void calc(){
        gs=basic+(0.75*basic);
        it=gs*0.3;
        ns=gs-it;
    }
    void display(){
        System.out.print("Employer name is");
        System.out.printf("%61s\n", name);
        System.out.print("Employer number is -");
        System.out.printf("%53s\n", empnum);
        System.out.print("Basic Salary is -");
        System.out.printf("%56.3f\n", basic);
        System.out.print("Dearness Allowance is-");
        System.out.printf("%51.3f\n", 0.75*basic);
        System.out.print("Income Tax is -");
        System.out.printf("%67.3f\n",it);
        System.out.print("_____________________________________________________________________________");
        System.out.print("\nNet Salary is - ");
        System.out.printf("%53.3f\n", ns);
    }
}
class aug23 {
    public static void main(String[] args){
        int n, choice;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number of employees- ");
        n=s.nextInt();
        employee emp=new employee();
        System.out.println("Inputting data-\n");
        for(int i=0; i<n; i++){
            emp.input();
            emp.calc();
            emp.display();
        }
    }
}
