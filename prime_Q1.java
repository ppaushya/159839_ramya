package com.demo.assignment;

import java.util.Scanner;

public class prime_Q1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		prime_Q1 obj=new prime_Q1();
		int num;
		//int[] prime;
		Scanner s= new Scanner(System.in);
		System.out.println("enter number");
		num=s.nextInt();
		System.out.println("prime factors are:");
		for(int i=2;i<=num;i++) {
			while(num%i==0) {
				System.out.print(i+" ");
			num=num/i;
		}
	}
	}
}
