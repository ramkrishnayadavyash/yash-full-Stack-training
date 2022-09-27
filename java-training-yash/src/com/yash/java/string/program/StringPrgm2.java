package com.yash.java.string.program;

public class StringPrgm2 {
	
	public static int stringlength(String inputstring)
	{

		int i=0;
		int count=0;
		int flag=0;
		while(true)
		{
			try
			{
		
			char ch=inputstring.charAt(i);
			count++;
			}
			catch (StringIndexOutOfBoundsException e) 
			{
				flag=1;
			}
			if(flag==1)
			{
			break;	
			}
			i++;
				
		}
		//lenght Without Using inbuilt methoed  
		//System.out.println(count);
		return count;
	}
	
	public static void main(String[] args) 
	{
		//Accepting the string from user
				String s1="Ramkrishn yadav";
				System.out.println("enter the inputstring1");
				String inputstring1="Ramkrishna";
				
				System.out.println("enter the inputstring2");
				String inputstring2="enter your string";
				
				//find string by using custom methoed
			int len1=stringlength(inputstring1);
			int len2=stringlength(inputstring2);
			char ar[]=inputstring1.toCharArray();
			char ar1[]=inputstring2.toCharArray();
			
			int count=0;
			if(len1<len2)
			{
				System.out.println("NOT Substring");
			}
			else 
			{
			int k=0;
			for(int i=0;i<len2;i++)
			{
		         
				for(int j=k;j<len1;j++)
				{
			  
					if(ar[i]==ar[j])
					{
						k=j;
						count++;
						break;
					}
				}
			}
			
			if(len2==count)
			{
				System.out.println("substring");
			}
			else
			{
				System.out.println("NOT substring");
			}
			}
			
			
			}

}
