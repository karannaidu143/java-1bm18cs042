import java.util.*;
class Account{
	String name;
	int number;
	Scanner s = new Scanner(System.in);
	void get_data(){
	}
	void deposit(){
	}
	void display(){
		System.out.println("Customer name : " + name + "\nCustomer Number : " + number + "\n");
	}
	void withdrawal(){
	}
	void min_bal_check(){
	}
	double compound_int(double balance){
		return 0;
	}
	void cheque(){
	}
}
class curr_acc extends Account{
	double balance = 0;
	void get_data(){
		System.out.println("Enter the name of customer : ");
		name = s.next();
		System.out.println("Enter the Account Number : ");
		number = s.nextInt();
	}
	void deposit(){
		System.out.print("Enter the amount to deposit in Current Account : ");
		double dep = s.nextDouble();
		balance = balance+dep;
		System.out.print("Current Balance : " + balance + "\n");
	}
	void display(){
		System.out.println("Customer name : " + name + "\nCustomer Number : " + number + "\n" + "Current Balance : " + balance);
	}
	void withdrawal(){
		System.out.println("Not allowed for Current Account!!");
	}
	void min_bal_check(){
			if(balance < 500){
				System.out.println("Minimum balance is not maintained. A Service Charge of Rs.50 is being imposed!");
				balance = balance - 50;
			}
			System.out.println("Current Balance : " + balance);
	}
	double compound_int(double balance){
		System.out.println("Interest accumulation is not available for Current Account!");
		return 0;
	}
	void cheque(){
		System.out.print("Enter the name of Beneficiary user name : ");
		String beneficiary = s.next();
		System.out.print("Enter the Cheque Amount : ");
		double cheque_amount = s.nextDouble();
		if(cheque_amount >= balance){
			System.out.println("Cheque Amount exceeds Balance!!");
		}
		else{
			balance = balance - cheque_amount;
			System.out.println("Current Balance : " + balance);
			min_bal_check();
		}
	}
}
class sav_acc extends Account{
	double balance = 0;
	void get_data(){
		System.out.println("Enter the name of customer : ");
		name = s.next();
		System.out.println("Enter the Account Number : ");
		number = s.nextInt();
	}
	void withdrawal(){
		System.out.print("Savings Balance : " + balance + "\nEnter the withdrawal amount : ");
		int withdrawal = s.nextInt();
		if(withdrawal <= balance){
			balance = balance - withdrawal;
			System.out.println("Withdrawn " + withdrawal + "\nSavings Balance : " + balance);
		}
		else{
			System.out.println("Withdrawal Amount is more than the Savings Balance.\nSavings Balance : " + balance);
		}
	}
	void display(){
		balance = compound_int(balance);
		System.out.println("Customer Name : " + name + "\nCustomer number : " + number + "\nSavings Balance : " + balance);
	}
	double compound_int(double bal){
		float rate = 5;
		System.out.print("Enter the time duration : ");
		double dur = s.nextDouble();
		double comp = bal*Math.pow((100 + rate)/100, dur);
		bal = bal + comp;
		return bal;
	}
	void min_bal_check(){
		System.out.println("Not required for Savings Account!!\n");
	}
	void deposit(){
		System.out.print("Enter the amount to deposit in Savings Account : ");
		double dep = s.nextDouble();
		balance = balance+dep;
		System.out.print("Savings Balance : " + balance + "\n");
	}
	void cheque(){
		System.out.println("Not allowed for Savings Account!!");
	}
}
class bankdemo{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		Account ob = null;
		int type;
		System.out.println("Enter the type of Account :\n1. Savings Account\n2. Current Account");
		type = sc.nextInt();
		switch(type){
			case 1: ob = new sav_acc();
					break;
			case 2: ob = new curr_acc();
					break;
		}
		ob.get_data();
		int op;
		do{
			System.out.println("Operations :\n1. Deposit\n2. Withdrawal(Only Available for Savings Account)\n3. Cheque Book Facility(Only Available for Current Account)\n4. Display the details\n5. Exit");
			op = sc.nextInt();
			switch(op){
				case 1: ob.deposit();
						break;
				case 2: ob.withdrawal();
						break;
				case 3: ob.cheque();
						break;
				case 4: ob.display();
						break;
				case 5: return;
			}
		}while(op != 5);
		return;
	}
}
