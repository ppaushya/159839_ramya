package com.demo.assignment;
import static java.lang.System.out;

import java.util.Arrays;
import java.util.Scanner;
public class Q7_Longestword {
public void largestword(String str) {
    String[] str1 = str.split(" ");
    String lng=str1[0];
   
    	for(int j=0;j<str1.length-1;j++) {
    		 if(str1[j+1].length()>str1[j].length()){
                  lng=str1[j+1];
              }
          
      }
    	String temp=" ";
    	int flag=0;
    	for(int i=0;i<str1.length;i++) {
    		if(lng.length()==str1[i].length()) {
    			temp=str1[i];
    			flag=1;
    			break;
    		}
    		}
    	if(flag==0) {
      System.out.println(lng);
      System.out.println(lng.length());
    	}
    	else{
    		out.println(temp);
    		out.println(temp.length());
    		
    	}
    
			
}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner st=new Scanner(System.in);
		String st1=new String();
		
		out.print("Enter 1st string");
		st1=st.nextLine();
		Q7_Longestword d=new Q7_Longestword();
		d.largestword(st1);
	}

}
