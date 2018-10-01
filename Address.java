package org.cap.project;

public class Address {
String Street_name;
int Door_no;
String State_name;
public Address() {
	
}
public String getStreet_name() {
	return Street_name;
}
public void setStreet_name(String street_name) {
	Street_name = street_name;
}
public int getDoor_no() {
	return Door_no;
}
public void setDoor_no(int door_no) {
	Door_no = door_no;
}
public String getState_name() {
	return State_name;
}
public void setState_name(String state_name) {
	State_name = state_name;
}
public Address(String street_name, int door_no, String state_name) {
	
	Street_name = street_name;
	Door_no = door_no;
	State_name = state_name;
}

}
