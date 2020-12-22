package javaHackathon;

import java.util.HashMap;
import java.util.Scanner;

public class Q20RepeatedULN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		String str = sc.nextLine();
		 characterCount(str);
	}
		
	
	static void characterCount(String inputString)
	 {
	  

	     HashMap<Character, Integer> eachCharCountMap = new HashMap<Character, Integer>();
	     char[] charArray = inputString.toCharArray();
	      for (char c : charArray)
	     {
	         if(eachCharCountMap.containsKey(c))
	         {
	          eachCharCountMap.put(c, eachCharCountMap.get(c)+1);
	             
	         }  else
	         {
	            eachCharCountMap.put(c, 0);
	         }
	             
	     }
	     System.out.print(eachCharCountMap);   
	 }
	     
	   

}
