package com.vivek.practice.javaprogram;
/*
 * @author   -VivekSharma
 * Class name - VowelChecking
 * Objective - It contains a method which check vowel in a string.
 * Date -  4april 2022
 */
public class VowelChecking {
/*
 * method name - CheckVowel
 * objective - it checks vowels in a string
 * Input parameter - String
 * Output - Boolean value
 * 
 */

	     public Boolean  CheckVowel(String string){
	    	 
	    	int size = string.length();
	    	String vowels = "aeiou";
	    	boolean flag = false;
	    	
	    	for(int i=0;i<size;i++) {
	    		for(int j=i;j<vowels.length();j++) {
	    			if(string.charAt(i) == vowels.charAt(j) ) {
	    				flag = true;
	    			}
	    		}
	    	}
			return flag;
	    	 
	     }
	   
	     
}
