package com.yash.java.string.program;

import java.util.Scanner;

public class StringPrgm1 {
	

public static void main(String[] args) {
	
	
		Scanner  sc= new Scanner(System.in);
		System.out.println("enter the your  frist output ");
		String inputstring1=sc.nextLine();
		
		System.out.println("enter the your  Second output ");
		String inputstring2=sc.nextLine();
		
		char input1[]=inputstring1.toCharArray();
		int ind=0;
		//logic for replace char
		for(int i=0;i<inputstring1.length();i++)
		{
			char c=inputstring1.charAt(i);
			if(c=='a' || c=='A'|| c=='E'|| c=='e' || c=='i' || c=='I' || c=='o' || c=='O' || c=='u' || c=='U')
			{
				try
				{
			input1[i]=inputstring2.charAt(ind);
			     ind++;
				}
				catch (StringIndexOutOfBoundsException e)
				{
					input1[i]='_';	
				}
			}

		}
		String s=new String(input1);
		System.out.println("Result  ="+s);
}

}
