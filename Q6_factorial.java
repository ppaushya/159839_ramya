package com.demo.assignment;
import java.lang.*; 
import java.io.*; 
import java.util.*; 

public class Q6_factorial
{
    public long FirstFactorial(int number)
    {
        int a;
        a=number;
        long factorial=1;
        for(int i=a;i>=1;i--)
        {
            factorial=factorial*i;
        }
        return factorial;
    }
	
	    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;long fact;
		System.out.println("enter number ");
		Scanner s=new Scanner(System.in);
		num=s.nextInt();
		Q6_factorial obj=new Q6_factorial();
		fact=obj.FirstFactorial(num);
		System.out.println("Factorial is: "+fact);
	}

}
