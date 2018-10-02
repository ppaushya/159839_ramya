package parallel_pro;

import java.util.Date;

public class Transaction {
String transaction_id;
Date transaction_date;
Long amount;
String Account_no;
public Transaction() {
	
}
public String getTransaction_id() {
	return transaction_id;
}
public void setTransaction_id(String transaction_id) {
	this.transaction_id = transaction_id;
}
public Date getTransaction_date() {
	return transaction_date;
}
public void setTransaction_date(Date transaction_date) {
	this.transaction_date = transaction_date;
}
public Long getAmount() {
	return amount;
}
public void setAmount(Long amount) {
	this.amount = amount;
}
public String getAccount_no() {
	return Account_no;
}
public void setAccount_no(String account_no) {
	Account_no = account_no;
}

}
