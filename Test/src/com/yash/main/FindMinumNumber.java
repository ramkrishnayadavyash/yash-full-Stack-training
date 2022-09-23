package com.yash.main;

public class FindMinumNumber {

	public static void thirdSmallestElement(int [] arrA){

        if(arrA.length<3){
            System.out.println("Invalid Input, array size is less than 3");
        }

        int first=arrA[0];
        int second=arrA[0];
        int third = arrA[0];
        
        System.out.println("Integer.MAX_VALUE" + first);

        for (int i = 0; i <arrA.length ; i++) {
            int current = arrA[i];
            if(first>current){
                third = second;
                second = first;
                first = current;
            }else if(second>current){
                third = second;
                second = current;
            }else if(third>current){
                third=current;
            }
        }
        System.out.println("Third smallest element is: " + third);
    }
	
	public static int getThirdSmallest(int[] a) {
	      int temp;
	      //sort the array
	      for (int i = 0; i < a.length; i++) {
	         for (int j = i + 1; j < a.length; j++) {
	            if (a[i] > a[j]) {
	               temp = a[i];
	               a[i] = a[j];
	               a[j] = temp;
	            }
	         }
	      }
	      //return third smallest element
	      return a[2];
	   }

	public static void main(String[] args) {
		int [] arrA = new int [] { 6, 2, 1, 9, 4,3, 10};
        thirdSmallestElement(arrA);
        getThirdSmallest(arrA);

	}

}
