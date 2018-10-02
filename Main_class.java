package parallel_pro;
import java.util.Date;
import java.util.Scanner;
public class Main_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		Date today = new Date();
		Main_class mc=new Main_class();
		Customer cust=new Customer();
		Address add=new Address();
		Account acc=new Account();
		Transaction tr=new Transaction();
		
		int choice;int t;
		
		//acc.opening_date=new Sysdate();
		mc.printdetails();
		System.out.println("select option"); 
		System.out.println("1.Do u want to create a new account");
		System.out.println("2.Do u want to do transactions on existing account");
		choice=s.nextInt();
		if(choice==1) {
			System.out.println("enter your id");
			cust.setCustomer_id(s.nextInt());
			System.out.println("enter your name");
			cust.setCustomer_name(s.nextLine());
			System.out.println("enter email id");
			cust.setEmail_id(s.nextLine());
			System.out.println("enter mobile no");
			cust.setMobile_no(s.nextLine());
			System.out.println("enter address");
			System.out.println("enter Doorno/plotno");
			add.setDoor_no(s.nextInt());
			System.out.println("enter street name/nearest Landmark");
			add.setStreet_name(s.nextLine());
			System.out.println("enter State name");
			add.setState_name(s.nextLine());
			System.out.println("Set your account no-4 digits");
			acc.setAccount_no(s.nextLine());
			System.out.println("Set Account_type");
			acc.setAccount_type(s.nextLine());
			System.out.println("Set opening balance");
			acc.setOpening_balance(s.nextLong());
			acc.opening_date=today;
			System.out.println("New Account created successfully");
			
		}
		
		else if(choice==2) {
			System.out.println("Enter account no");
			tr.setAccount_no(s.nextLine());
			System.out.println("Enter transaction id");
			tr.setTransaction_id(s.nextLine());
			tr.transaction_date=today;
			System.out.println("do u want to debit(1)/credit(2)");
			t=s.nextInt();
			System.out.println("enter amount");
			tr.setAmount(s.nextLong());
			if(t==1)
				tr.amount=acc.opening_balance-tr.getAmount();
			else if(t==2)
				tr.amount=acc.opening_balance+tr.getAmount();
//			else 
//				System.out.println("enter valid option");
			
			System.out.println("transaction done");
			System.out.println("Transaction Summary:");
			System.out.println("Transaction id:"+tr.getTransaction_id());
			System.out.println("transaction date:"+tr.getTransaction_date());
			System.out.println("account no:"+tr.getAccount_no());
			System.out.println("Total Amount:"+tr.getAmount());
			if(t==1)
				System.out.println("Debit transaction done");
			else if(t==2)
				System.out.println("Credit Transaction done");
		}
	}

	private void printdetails() {
		
		System.out.println("Customer details are:");
		System.out.println();
		System.out.println("account.no."+"\t"+"cust_name"+"\t"+"email_id"+"\t"+"mobile.no");
		System.out.println("1001"+"\t"+"\t"+"John"+"\t"+"\t"+"john@gmail.com"+"\t"+"9423834229");
		System.out.println("1002"+"\t"+"\t"+"henry"+"\t"+"\t"+"henry@gmail.com"+"\t"+"9423834243");
		System.out.println("1003"+"\t"+"\t"+"bittu"+"\t"+"\t"+"bittu@gmail.com"+"\t"+"9423834235");
		System.out.println("1004"+"\t"+"\t"+"roopa"+"\t"+"\t"+"roopa@gmail.com"+"\t"+"9423834332");
		System.out.println("1005"+"\t"+"\t"+"sunny"+"\t"+"\t"+"sunny@gmail.com"+"\t"+"9423834334");
		System.out.println();
	}

}
