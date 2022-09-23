package com.yash.test;

public class MethodOverriding {

	public static void main(String[] args) {
		DemoPart1 dem= new DemoPart1();
	System.out.println("DemoPart1 dem= new DemoPart1()");
	
	dem.display();
	DemoPart1.test();
	/*
	 * DemoPart1 dm= (DemoPart1) new Demo();
	 * System.out.println("DemoPart1 dm= (DemoPart1) new Demo()"); dm.display();
	 */
	 Demo demo= new DemoPart1();
	 System.out.println(" Demo demo= new DemoPart1();");
	 demo.display();
	 Demo.test();
	 Demo demo1= new Demo();
	 
	 System.out.println(" Demo demo1= new Demo()");
	 
	 demo1.display();
	 demo1.test();}

}
