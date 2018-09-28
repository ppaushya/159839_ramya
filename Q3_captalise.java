
package com.demo.assignment;

import java.lang.*; 
import java.io.*; 
import java.util.*; 

public class Q3_captalise{

	 public static void main(String[] args) {
         String str;int count=0;
        Scanner s=new Scanner(System.in);
        System.out.println("enter string");
        str=s.nextLine();
        char[] arr=new char[str.length()];
        
        
        for(int i=0;i<str.length();i++)
        {
            arr[i]=str.charAt(i);
        }
        
        
         for(int j=0;j<str.length()-2;j++)
        {
            if(arr[j]==' '&&arr[j+1]==' ') {
            System.out.println("enter only 1 spaces btw words") ;
            count=1;
            }
        }
         
        if(count!=1){
        for(int j=0;j<str.length()-1;j++)
        {
         if(j==0)
            arr[j]=(char)(arr[j]-32);   
            if(arr[j]==' ')
            arr[j+1]=(char)(arr[j+1]-32);
            
            
        }
        
        }
         for(int i=0;i<str.length();i++)
        {
           System.out.print(arr[i]);
        }
        
     }
}


