package com.yash.main;

public class StringPalindrome {

	public static void main(String[] args) {
		String name="Cooc";
		
		String rev="";
		char[] ch= name.toCharArray();
		
		for(int i=ch.length-1;i>=0;i--) {
			rev=rev+ch[i];
			
			
		}
		
	//	System.out.print(rev);
		if(rev.equalsIgnoreCase(name)) {
			System.out.print(rev +" String is palindrome");
			
		}else {
			System.out.print(rev +" String not  is palindrome");
		}
	}

}
