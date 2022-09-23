package com.yash.main;

import java.util.ArrayList; 
import java.util.List; 
public class SplitMethod { 
 
	public static void main(String[] args) { 
		// TODO Auto-generated method stub 
 
		// Defined String 
		String str = "My name is rishabh bakshi"; 
 
		// Container to store the splited part  
		List<String> lst = new ArrayList<String>(); 
		 
		// Break the string into char array 
		char[] charArray = str.toCharArray(); 
		String strTemp = ""; 
 
		// Traverse each and every character of the char array 
		for (int i = 0; i < charArray.length; i++) { 
			if (charArray[i] != ' ') { 
				strTemp = strTemp + charArray[i]; 
			} else { 
				// Clear the string after finding the space in the charArray 
				lst.add(strTemp); 
				strTemp = ""; 
			} 
		} 
 
		// Print all splited part of the string 
		lst.stream().forEach(n -> System.out.println(n)); 
	} 
} 