package javaHackathon;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Q15Unique {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		String str = sc.nextLine();
		sc.close();
	      String[] strArray = str.split(" ");
	      Map<String, String> hMap = new LinkedHashMap<String, String>();
	      for(int i = 0; i < strArray.length ; i++ ) {
	         if(!hMap.containsKey(strArray[i])) {
	            hMap.put(strArray[i],"Unique");
	         }
	      }
	      System.out.println(hMap);
		
	}

}
