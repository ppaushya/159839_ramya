package com.demo.assignment;
import java.lang.*; 
import java.io.*; 
import java.util.*; 
 
public class Q4_replace {

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
       for(int j=0;j<=str.length()-1;j++)
       {
           arr[j]=(char)(arr[j]+1);
       }
       System.out.println("replaced array is: ");
       for(int i=0;i<str.length();i++)
       {
          System.out.print(" "+arr[i]);
       }
       System.out.println();
       for(int j=0;j<=str.length()-1;j++)
       {
           if(arr[j]=='a'||arr[j]=='e'||arr[j]=='i'||arr[j]=='o'||arr[j]=='u')
           arr[j]=(char)(arr[j]-32);
       }
       
        for(int i=0;i<str.length();i++)
       {
          System.out.print(" "+arr[i]);
       }
       
    }

	}

