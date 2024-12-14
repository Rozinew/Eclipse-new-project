package helloworld;

import java.util.Arrays;

public class Anagramstring {

	public static void main(String[] args) {
		
		String s1 = "Rozi";
		String s2 = "ZORI";
		 s1 = s1.toLowerCase();  
	        s2 = s2.toLowerCase();  
	        
	        if (s1.length()!= s2.length())
	        {
	        	System.out.println("strings are not anagram");
	        }
	        
		  
	        else 
	        {
	        	
		
			 char[] string1 = s1.toCharArray();  
	            char[] string2 = s2.toCharArray();  
	            Arrays.sort(string1);  
	            Arrays.sort(string2);  
		}
	
	        
			if (Arrays.equals(string1,string2)
	        {  
	        	

	}

	}

}
