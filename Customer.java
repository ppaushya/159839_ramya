package parallel_pro;

public class Customer {
	

	private int Customer_id;
	private String Customer_name;
	private String email_id;
	private Address address;
	private Account account[];
	private String mobile_no;
	

	public Customer(int customer_id, String customer_name, String email_id,
			String mobile_no, Address address, Account[] account) {
		
		this.Customer_id = customer_id;
		this.Customer_name = customer_name;
		this.email_id = email_id;
		this.address = address;
		this.account = account;
		this.mobile_no = mobile_no;
	}
	public Customer() {
		
	}


	public int getCustomer_id() {
		return Customer_id;
	}


	public void setCustomer_id(int customer_id) {
		Customer_id = customer_id;
	}


	public String getCustomer_name() {
		return Customer_name;
	}


	public void setCustomer_name(String customer_name) {
		Customer_name = customer_name;
	}


	public String getEmail_id() {
		return email_id;
	}


	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}



	public String getMobile_no() {
		return mobile_no;
	}


	public void setMobile_no(String mobile_no) {
		this.mobile_no = mobile_no;
	}
	
}
	