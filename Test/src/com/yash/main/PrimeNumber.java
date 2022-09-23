package com.yash.main;

public class PrimeNumber {
	
	public static void main(String[] args) {
		
		
		int number=131;
		/*
		 * int num=number/2; boolean flag= true;
		 * 
		 * for(int i=2;i<=num;i++) {
		 * 
		 * if(number%i==0) { flag= false; System.out.print(number
		 * +" number is not prime  "); break; }
		 * 
		 * 
		 * }
		 * 
		 * if(Sflag) {
		 * 
		 * 
		 * 
		 * 
		 * }
		 */
		
		//printing 1 to n number of prime number
		
		for(int i =1;i<=number;i++) {
		if(isPrime(i)) {
			System.out.print(i +" ");
		}
		}
	}
	
	
	 static boolean  isPrime(int num) {
		
		if(num==0 || num==1) {
			
			return false;
		}
		
		for(int i=2;i<Math.sqrt(num);i++) {
			
			
			if(num%i==0) {
				
				return false;
				
			}
		}
		
		return true;
	}

}
