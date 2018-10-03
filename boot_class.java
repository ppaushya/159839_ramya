package banking;



import java.time.LocalDate;
import java.util.Scanner;



public class boot_class {
	
	
	
	static Scanner scanner=new Scanner(System.in);
	
	public static Customer[] loadCustomer() {
		Customer[] customers=new Customer[5];
		
		Address address=new Address("North Avennue", "Cross St", "Chennai", "TN");
		customers[0]=new Customer(1001, "Tom",address ,new Account[5],  "12453535", "tom@gmail.com");
		Account account=new Account(1234, AccountType.SAVINGS, LocalDate.now(), 45000);
		customers[0].getAccount()[0]=account;
		
		
		
		Address address1=new Address("South Avennue", "Cross St", "Hyderabad", "AP");
		customers[1]=new Customer(1002, "Jerry",address1 ,new Account[5],   "43454354", "jerry@gmail.com");
		
		Address address2=new Address("West car st", "Cross St", "Chennai", "TN");
		customers[2]=new Customer(21321, "Jack",address2 , new Account[5],  "435435543", "jack@gmail.com");
		
		Address address4=new Address("West Avennue", "Cross St", "Pune", "MH");
		customers[3]=new Customer(87868, "Kamal",address4 ,new Account[5],   "43543543", "kamal@gmail.com");
		
		Address address3=new Address("East Avennue", "Cross St", "Delhi", "UP");
		customers[4]=new Customer(657657, "Jasmine",address3 , new Account[5], "352325", "jas@gmail.com");
		
		
		return customers;
	}
	
	
	public static void printCustomer() {
		System.out.println("Available Customers:");
		Customer[] customers=loadCustomer();
		for(Customer customer:customers) {
			System.out.println(customer.getCustomerId()+"\t"+customer.getCustomerName() +"\t"
					+customer.getEmailId()+"\t"+ customer.getMobile());
		}
		
	}
	
	
	
	public static void printAccountType() {
		AccountType[] types=AccountType.values();
		int count=0;
		for(AccountType type:types)
			System.out.println(++count + "." + type);
	}

	
	public static AccountType assignAccountType(int value) {
		switch(value) {
		case 1:
			return AccountType.SAVINGS;
		case 2:
			return AccountType.CURRENT;
		case 3:
			return AccountType.RD;
		case 4:
			return AccountType.FD;
		default:
			System.out.println("Invalid Account Type");
			System.exit(0);
		}
		
		return null;
	}
	
	
	public static Customer findCustomer(int customerId) {
		for(Customer customer:loadCustomer()) {
			if(customer.getCustomerId()==customerId)
				return customer;
		}
		return null;
	}
	
	
	public static void main(String[] args) {
		Transaction[] transactions=new Transaction[100];
		int choice;
		int index=0;
		int customerId;
		int accountTypeNo;
		printCustomer();
		System.out.println("Choose customer Id:");
		customerId=scanner.nextInt();
		Customer customer=findCustomer(customerId);
		char myChoice;
	do {
			if(customer!=null) {
				System.out.println("1.Create new Account");
				System.out.println("2.Perform Transaction");
				System.out.println("3.Transaction Summary");
				System.out.println("Enter your Choice[1,2]?");
				choice=scanner.nextInt();
				if(choice==1) {
					Account account=new Account();
					System.out.println("Enter Account details");
					account.setAccountNo(AccountTransaction.generateAccountNo());
					
					System.out.println("Choose Account Type[1,2,3,4]:");
						printAccountType();
						accountTypeNo=scanner.nextInt();
						account.setAccountType(assignAccountType(accountTypeNo));
					
					System.out.println("Enter account OpeningDate:");
					System.out.println("Enter year:");
					int year=scanner.nextInt();
					System.out.println("Enter Month:");
					int month=scanner.nextInt();
					System.out.println("Enter dayOfMonth:");
					int dayOfMonth=scanner.nextInt();
					
						LocalDate date=LocalDate.of(year, month, dayOfMonth);
						account.setOpeningDate(date);
						
					System.out.println("Enter Opening Balance:");
					account.setOpeningBalance(scanner.nextDouble());
					
					Account[] account2=customer.getAccount();
					//System.out.println(account);
					for(int i=0;i<account2.length;i++)
					{
						if(account2[i]==null) {
							account2[i]=account;
							break;
						}
					}
					System.out.println(customer);
					
				}else if(choice==2) {
					
					AccountTransaction tx=new AccountTransaction();
					Transaction transaction;
			
					System.out.println("Choose Any one of the account number:");
					if(customer.getAccount()[0]!=null)
						tx.printAccounts(customer);
					else
						System.out.println("Sorry! No account details present for this Customer.");
					long accountNo=scanner.nextLong();
					
					if(tx.isValidAccount(accountNo, customer)) {
						transaction=new Transaction();
						
						transaction.setTransactionId((int)AccountTransaction.generateAccountNo());
						
						System.out.println("1.Deposit");
						System.out.println("2.Withdrawal");
						System.out.println("Choose your option:");
						int option=scanner.nextInt();
						if(option==1)
							transaction.setTransactionType("credit");
						else if(option==2)
							transaction.setTransactionType("debit");
						else {
							System.out.println("Sorry! invalid option!");
							System.exit(0);
						}
						
						Account account=tx.findAccount(accountNo, customer);
						transaction.setAccount(account);
						
						transaction.setTransactionDate(LocalDate.now());
						
						System.out.println("Enter amount:");
						transaction.setAmount(scanner.nextDouble());
						if(option==1)
						account.setOpeningBalance(account.getOpeningBalance()+transaction.getAmount());
						else if(option==2) {
							if(account.getOpeningBalance()>transaction.getAmount()) {
						account.setOpeningBalance(account.getOpeningBalance()-transaction.getAmount());
							}
							else
								System.out.println("You do not have sufficient bal to perform transaction");
						}
						transactions[index]=transaction;
						index++;
					}
					
					
				}else if(choice==3) {
					for(int i=0;i<=index;i++) {
					printTransactionSummary(transactions);
					}					
				}else {
					System.out.println("Sorry! INvalid choice. Please try Again!");
				}
				
			}
			else {
				System.out.println("Invalid Customer Number! Please try.");
			}
			
			System.out.println("Would you like to continue[y|n]?");
			myChoice=scanner.next().charAt(0);
		}while(myChoice=='y'||myChoice=='Y');
	}
	
	
	
	
	
	
	
	public static void printTransactionSummary(Transaction[] transactions) {
		System.out.println("\nTransaction Summary\n--------------------\n");
		
		for(Transaction transaction:transactions) {
			if(transaction!=null) {
				System.out.println("Transaction Date"+"\t"+"Transaction Id"+"\t"+"AccountNo"+"\t"+
			"TransactnType"+"\t"+"Accounttype"+"\t"+"TransactionAmount"+"\t"+"CurrentBalance");
			System.out.println(transaction.getTransactionDate() +"\t"+"\t"
					+ transaction.getTransactionId()+"\t"+"\t"
					+ transaction.getAccount().getAccountNo()+"\t"+"\t"
					+transaction.getTransactionType()+"\t"+"\t"+transaction.getAccount().getAccountType()+"\t"+"\t"
					+transaction.getAmount()+"\t"+"\t"+"\t"+transaction.getAccount().getOpeningBalance()
					);
			System.out.println("--------------------------------------");
			}
		}
	}
	
}
