package com.demo.assignment;
import java.lang.*; 
import java.io.*; 
import java.util.*; 

public class Q5_reverse_order {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str;
       Scanner s=new Scanner(System.in);
       System.out.println("enter string");
       str=s.nextLine();
       char[] arr=new char[str.length()];
       for(int i=0;i<str.length();i++)
       {
           arr[i]=str.charAt(i);
       }
        char[] revarr=new char[str.length()];
       for(int i=0;i<str.length();i++)
       {
           revarr[i]=arr[str.length()-i-1];
        }
         for(int i=0;i<str.length();i++)
        {
           System.out.print(revarr[i]);
        }
        
     }
}

