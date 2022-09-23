package com.yash.main;

class A{ 
	
A get(){
	return this;
	}    
}    
    
 public class B1 extends A{    
@Override  
B1 get(){
	return this;
	
}    
void message(){
	System.out.println("welcome to covariant return type");
	
}    
    
public static void main(String args[]){    
 B1 b=new B1();;    
}    
}    