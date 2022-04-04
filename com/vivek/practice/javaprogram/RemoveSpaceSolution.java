/**
 * 
 */
package com.vivek.practice.javaprogram;

/**
 * @author VivekSharma
 * class name - RemoveSpaceSolution
 * objective - This class contains a method which remove all white spaces in a string
 * Date - 4April 2022
 */
public class RemoveSpaceSolution {
            public String RemoveSpace(String string) {
            	int size = string.length();
            	String newstring = "";
            	for(int i=0;i<size;i++) {
            		if(string.charAt(i) != ' ') {
            			newstring += string.charAt(i);
            		}
            		
            	}
            	return newstring;
            }
            
}
