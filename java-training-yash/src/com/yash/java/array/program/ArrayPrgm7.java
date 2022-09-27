package com.yash.java.array.program;

import java.util.Scanner;

public class ArrayPrgm7 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int size=sc.nextInt();
        
        
        int array[]=new int[size];
        for(int i=0;i<size;i++) {
        	System.out.println("Enter an array element: "+(i+1));  
        	array[i]=sc.nextInt();
        }
        
         int min, max, x, lcm = 0,hcf = 0;
         for(int i = 0; i<size; i++) {
             for(int j = i+1; j<size-1; j++) {
                if(array[i] > array[j]) {
                   min = array[j];
                   max = array[i];
                } else {
                   min = array[i];
                   max = array[j];
                }
                for(int k =0; k<size; k++) {
                   x = k * max;
                   if(x % min == 0) {
                      lcm = x ;
                   }
                }
            
         
                if(array[i]<array[j]) {
                    hcf=array[i];
                }
                else {
                    hcf=array[j];
                }
                while(true) {
                     if((array[i]%hcf==0) && (array[j]%hcf==0))
                         break;
                      else
                         hcf--;
                }
             }
          }
         
          System.out.println("LCM of the given array of numbers : " + lcm);
          System.out.println("HCF of the given array of numbers : " + hcf);
         
	}
}
