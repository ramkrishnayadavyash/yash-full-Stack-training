package com.yash.main;



public class ChangeSmallTocapticalAndCapticalToSmall{
    public static void main(String[] args){

        toLowerCase("RaMkRiShNa");
    }

    public static void toLowerCase(String a){

        for (int i = 0; i< a.length(); i++){

            char aChar = a.charAt(i);
            if (65 <= aChar && aChar<=90){
                aChar = (char)( (aChar + 32) ); 
                System.out.print(aChar);
            } else if(aChar>96 && aChar<123) {
            	aChar=(char) (aChar-32);
                System.out.print( (char) aChar);
                //System.out.print(aChar);
            }

            
        }
     } 
    
    
}