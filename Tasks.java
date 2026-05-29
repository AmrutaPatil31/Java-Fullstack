package com.tka.may29;

import java.util.Scanner;

public class Tasks {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		int temp=num;
		//Sum of digits
		int sum=0,rem,rev=0;
		while(num>0) {
			rem=num%10;
			sum+=rem;
			rev=rev*10+rem;
			num=num/10;
		}
		if(temp==rev) {
			System.out.println("Number is palindrome");
		}else {
			System.out.println("Number is not a palindrome");
		}
		System.out.println("sum of digits:"+sum);
		System.out.println("reversed number:"+rev);
		
		
		
		sc.close();

	}

}
