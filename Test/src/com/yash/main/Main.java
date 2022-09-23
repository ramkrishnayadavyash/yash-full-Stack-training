package com.yash.main;

import java.io.IOException;
import java.util.Comparator;
import java.util.function.Function;

import com.yash.interfce.DemoFuncational;
import com.yash.test.Demo;
import com.yash.test.DemoPart1;

public class Main {

	public static void main(String[] args) {
		/*
		 * DemoFuncational fun= n->{return n*n;}; System.out.println(fun.squre(5555)); ;
		 */
		
		String s= "ram";
		s.concat(" krisha");
		//System.out.println(s);
		
		String str = "Sharma is a good player and he is so punctual"; 
		char ch[] = str.toCharArray();
		System.out.println(str.length());;
		System.out.println(ch.length);
		String words[] = str.split(" ");  
		
		System.out.println(words.length);
		
		
		
		for(int i =0;  i<words.length;i++) {
			System.out.print(words[i]+" ");
			
		}
		
		try {
			Runtime.getRuntime().exec("notepad++");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}
	

}
