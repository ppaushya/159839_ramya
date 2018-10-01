package org.cap.project;

public class Account {
String Account_no;
String account_type;
String opening_date;
long opening_balance;
public Account() {
	
}
public String getAccount_no() {
	return Account_no;
}
public void setAccount_no(String account_no) {
	Account_no = account_no;
}
public String getAccount_type() {
	return account_type;
}
public void setAccount_type(String account_type) {
	this.account_type = account_type;
}
public long getOpening_balance() {
	return opening_balance;
}
public void setOpening_balance(long opening_balance) {
	this.opening_balance = opening_balance;
}
}
