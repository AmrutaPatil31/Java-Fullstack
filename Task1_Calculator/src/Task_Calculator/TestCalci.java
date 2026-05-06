package Task_Calculator;

import java.util.Scanner;

public class TestCalci {
	public static void main (String [] args) {
		Scanner sc=new Scanner(System.in);
		
		Calculator c1=new Calculator();
		
		System.out.println("Enter value of a:");
		int a=sc.nextInt();
		
		System.out.println("Enter value of b:");
		int b=sc.nextInt();
		
		System.out.println("Enter value of c:");
		int c=sc.nextInt();

		c1.Addition(a,b,c);
		c1.Average(6,8,4);
		c1.Subtraction( a, b);
	}
	
}


