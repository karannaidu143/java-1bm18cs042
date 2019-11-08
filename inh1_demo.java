import java.util.*;
class PERSON {
	String name, address;
	int age;
}
class STUDENT extends PERSON {
	String rollno;
	int sem;
}
class EXAM extends STUDENT{
	int m1, m2;
	Scanner s = new Scanner(System.in);
	double avg;	
	void get_data(){
		System.out.print("\nEnter the following details -\nName - ");
		name = s.next();
		System.out.print("Address - ");
		address = s.next();
		System.out.print("Age - ");
		age = s.nextInt();
		System.out.print("Roll no - ");
		rollno = s.next();
		System.out.print("Semester - ");
		sem = s.nextInt();
		System.out.print("Marks in Subject 1 - ");
		m1 = s.nextInt();
		System.out.print("Marks in Subject 2 - ");
		m2 = s.nextInt();
	}
}
class inh1_demo{
	public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_RESET = "\u001B[0m";
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of students -");
		int n = sc.nextInt();
		EXAM arr[] = new EXAM[n];
		for(int i = 0; i < n ; i++){
			arr[i] = new EXAM();
			System.out.println(ANSI_YELLOW + "------------- Student " + (i+1) + " --------------" + ANSI_RESET);
			arr[i].get_data();
		}
		// Calculation of avg of each student
		double z = -9999;
		String topper = "";
		for(int i = 0; i < n ; i++){
		    double avg = ((arr[i].m1 + arr[i].m2)/2);
			if(avg > z){
				topper = arr[i].name;
				z = avg;
			}
		}
		System.out.println("---------------------------------------");
		System.out.println("The topper of the class is " + ANSI_CYAN + topper + ANSI_RESET);
	}
}
