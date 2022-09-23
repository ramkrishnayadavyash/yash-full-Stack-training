package com.yash.main;

public class FibonacciSeries {
	 static int number =10;
	 static int n1=0,n2=1,n3; 
	public static void main(String[] args) {
		// e.g. 1 1 2 3 5 8 13 
		
		
		/*
		 * for(int i=1;i<number;i++) {
		 * 
		 * n3=n1+n2; System.out.print(n3+" "); n1=n2; n2=n3;
		 * 
		 * }
		 */
		
		// second way using rescurion 
		
		System.out.print(n1+" "+n2 +" ");
		fibnoacci(number-n2);
		

	}
	
	static void fibnoacci(int number) {
		if(number>0) {
		n3=n1+n2;
		System.out.print(n3+" ");
		n1=n2;
		n2=n3;
		fibnoacci(number-1);
		}
		
	}

}
