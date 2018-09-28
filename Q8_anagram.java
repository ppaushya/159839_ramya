package com.demo.assignment;

import java.util.Scanner;

public class Q8_anagram {
public String checkAnagram(char[] array1,char[] array2)
{
	int x;int y;String z = null;int count=0;
	char[] word1;
	char[] word2;
	word1=array1;
	word2=array2;
	x=array1.length;
	y=array2.length;
	if(x==y) {
		for(int i=0;i<x-1;i++)
		{
			for(int j=0;j<x-1;j++)
			{
			if(word1[i]==word2[j])
			{
				word2[j]=' ';
				count++;
			}
		}
	}
		
}
	if (count==3)
		z="yes";
	else
		z="no";
	return z;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str1;String str2;String ans;
		 Q8_anagram obj=new  Q8_anagram();
	        Scanner s=new Scanner(System.in);
	        System.out.println("enter 2 strings");
	        str1=s.nextLine();
	        str2=s.nextLine();
	        char[] arr1=new char[str1.length()];
	        char[] arr2=new char[str2.length()];
	      
	        for(int i=0;i<str1.length();i++)
	        {
	            arr1[i]=str1.charAt(i);
	        }
	        for(int j=0;j<str2.length();j++)
	        {
	            arr2[j]=str2.charAt(j);
	        }
	         ans=obj.checkAnagram(arr1,arr2);
	         if(ans=="yes")
	        	 System.out.println("yes 2 strings are anagram");
	         if(ans=="no")
	        	 System.out.println("no 2 strings are not anagram");
	}

}
