package Task_Calculator;


public class Calculator {

	void Addition(int a,int b,int c) {
		int add=a+b+c;
		System.out.println("Addition:"+add);
	}
	
	void Average(int n,int l,int m) {
		
		//we can directly create custom datatype here to call the diff method
		Calculator c1=new Calculator();
		c1.Addition(n,l,m);
		
		//we can directly addition method
		Addition(1,2,3);
		
		float Avg=(n+l+m)/3;
		System.out.println("Average:"+Avg);
	}
	void Subtraction(int a,int b) {
		int c;
		if(a>b) {
			 c=a-b;
		}
		else {
			 c=b-a;
		}
		System.out.println("subtraction:"+c);
	}

}
