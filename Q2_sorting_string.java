package com.demo.assignment;

import java.util.Scanner;

public class Q2_sorting_string {
	public char[] AlphabetSoup(char[] array1,int size){
	    char temp;
	    char[] alpha;
	    int x;
	    x=size;
	    alpha=array1;
	    for(int i=0;i<x-1;i++)
	        {
	            for(int j=0;j<x-i-1;j++)
	        {
	            if(alpha[j]>alpha[j+1]){
	                temp=alpha[j];
	                alpha[j]=alpha[j+1];
	                alpha[j+1]=temp;
	            }
	        }
	        }
	        return alpha;
	    
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		    	 Q2_sorting_string obj=new Q2_sorting_string();
		         String str;int len=0;
		         Scanner s=new Scanner(System.in);
		        System.out.println("enter string");
		        str=s.nextLine();
		        char[] arr=new char[str.length()];
		        char[] sorted=new char[str.length()];
		        len=str.length();
		        for(int i=0;i<str.length();i++)
		        {
		            arr[i]=str.charAt(i);
		        }
		        sorted=obj.AlphabetSoup(arr,len);
		        System.out.println("sorted array is:");
		         for(int i=0;i<str.length();i++)
		        {
		           System.out.print(sorted[i]);
		        }
		        
		     }

}
