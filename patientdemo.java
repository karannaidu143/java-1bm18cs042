import java.util.*;
class Patient{
    String patient_id, patient_name;
    public String doc1;
    int patient_age;
    Scanner s = new Scanner(System.in);
    void getdata(int a){
        System.out.print("\nEnter the details of the Patient " + (a+1) + "-\nName : ");
        patient_name = s.nextLine();
        System.out.print("ID : ");
        patient_id = s.next();
        System.out.print("Age : ");
        patient_age = s.nextInt();
        System.out.print("Name of the Doctor : \n");
        doc1 = s.next();
    }
    void displaydata(){
        System.out.println("The Patient details is as follows -");
        System.out.println("Name : " + patient_name);
        System.out.println("ID : " + patient_id);
        System.out.println("Age : " + patient_age);
        System.out.println("Doctor : " + doc1);
    }
}
class patientdemo{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the Total Number of Patients : ");
        int n = sc.nextInt();
        int i, j, choice, x, repeat;
        String doct1;
        Patient parr[] = new Patient[n];
        for(i = 0 ; i < n ; i++){
            parr[i] = new Patient();
            parr[i].getdata(i);
        }
        System.out.println("\nList of Operations -\n1. Display details of specific Patient\n2. Display the Patients of particular Doctor ");
        do{
            System.out.println("Enter the operation ");
            choice = sc.nextInt();
            switch(choice){
                case 1: {
                    System.out.println("Enter the Patient number ");
                    x = sc.nextInt();
                    parr[(x-1)].displaydata();
                    break;
                }
                case 2: {
                    System.out.print("Enter the Doctor name : \n");
                    doct1 = sc.next();
                    int found = 0;
                    for(j = 0 ; j<n ; j++){
                        System.out.println("Checking..");
                        System.out.println(doct1);
                        System.out.println(parr[j].doc1);
                        if(doct1 == (parr[j].doc1)){
                            parr[j].displaydata();
                            found++;
                        }
                    }
                    System.out.println("Found " + found + " patients related to Doctor " + doct1);
                    break;
                }
            }
            System.out.println("Do you want to repeat?\n(1 for Yes)");
            repeat = sc.nextInt();
        }while(repeat == 1);
    }
}
