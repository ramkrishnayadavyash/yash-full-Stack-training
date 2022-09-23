package com.yash.main;

import java.util.Arrays;

public class StringBasedProgram {

	public static void main(String[] args) {
		String str="Ramkrishna Yadav ";
		String s1="Sachin";  
		   String s2="SACHIN";  
		  
		   System.out.println(s1.equals(s2));//false  
		   System.out.println(s1.equalsIgnoreCase(s2));//true  
		
		
		//print the value in upper case 
		//System.out.println(str.toUpperCase());
		
		     // print the value in lowar case 
			//	System.out.println(str.toLowerCase());
			 //	str.charAt(5);
				//print the index based value 
				System.out.println(str.charAt(5));
				
				//print the has code of the value 
				
				//System.out.println(str.hashCode());
				//-1972413891
				//System.out.println(str.length());
			//String str1	=str.trim();
				//System.out.println(str);
				//System.out.println(str1.length());

				
				/*  
				 * convrt   aaray to String 
				 * */
				
				String[] stringArray = { "My", "name", "is", "Ramkrishna", "!" };
				System.out.println("the Array is ");
				System.out.println(stringArray);
				String strArr=stringArray.toString();
				String newStr=Arrays.toString(stringArray);
				
				System.out.println("the string is ");
				System.out.println(newStr);
				
				for(String ch:stringArray) {
					System.out.print(ch);
					
				}
				
	}

}
