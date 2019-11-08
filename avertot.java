//Program to learn accessing 2D array with some places blank
//This program gives a java runtime error in cmd, as I have implemented colors
//1BM18CS036
import java.util.*;
class avertot {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static void main(String[] args){
        int stu, sub;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Students - ");
        stu = sc.nextInt();
        System.out.println("Enter the number of Subjects - ");
        sub = sc.nextInt();
        double arr[][] = new double[(stu+2)][(sub+2)];
        double total, average;
        int i, j;           // This is declared here as i & j should be in scope
        System.out.println("Entering the marks -\n");
        for (i = 0 ; i < stu ; i++){
            System.out.print(ANSI_PURPLE);
            System.out.println("--------- Student " + (i+1) + " ---------");
            total = 0;
            for (j = 0 ; j < sub ; j++){
                System.out.print(ANSI_GREEN);
                System.out.println("Enter the Marks in subject " + (j+1));
                arr[i][j] = sc.nextDouble();
                total += arr[i][j];
            }
            arr[i][j] = total;
            average = total/sub;
            arr[i][++j] = average;
        }
        for (j = 0 ; j < sub ; j++){
            total = 0;
            for (i = 0 ; i < stu ; i++){
                total += arr[i][j];
            }
            arr[i][j] = total;
            average = total/stu;
            arr[++i][j] = average;
        }
        System.out.print(ANSI_RESET + "\nNow Displaying the results - \n\n_________| " + ANSI_RED);
        for (i = 1 ; i <= sub ; i++){
            String s = "S"+i;
            System.out.printf("%-9s", s);               //Prints S1, S2, .. so on with proper spaces
        }
        System.out.print("Total      Average\n");       //Prints Total and Average in the same line as S1, S2 etc
        for (i = 0 ; i < stu ; i++){
            System.out.print(ANSI_RED);
            System.out.printf("%-11s", "Student"+(i+1)); //Prints Student1, Student2 in the rows according to the loop
            for (j = 0 ; j < sub ; j++){
                System.out.print(ANSI_GREEN);
                System.out.printf("%-9.0f", arr[i][j]);  // Prints the marks, but doesn't print total and average
            }
            System.out.printf("%-11.1f", arr[i][j]);     // Prints the total in the row
            System.out.printf("%-9.1f%n", arr[i][++j]);  // Prints the average in the row
        }
        System.out.print(ANSI_RED);
        System.out.printf("%-11s", "Total");             //Prints the last but one line Total
        for (j = 0 ; j < sub ; j++){
            System.out.print(ANSI_GREEN);
            System.out.printf("%-9.1f", arr[i][j]);      //Prints the total values
        }
        System.out.print("\n" + ANSI_RED);
        System.out.printf("%-11s", "Average");           //Prints the last line Average
        i++;         //For moving to the next ith index
        for (j = 0 ; j < sub ; j++){
            System.out.print(ANSI_GREEN);
            System.out.printf("%-9.1f", arr[i][j]);      //Prints the average values
        }
    }
}
