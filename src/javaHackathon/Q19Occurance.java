package javaHackathon;

import java.util.Scanner;

public class Q19Occurance {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.next();
		String checked ="";		
		for(int i=0;i<str.length();i++){
			String current = str.substring(i,i+1);
			if(!checked.contains(current)){
				int icount=1;
				for(int j=i+1;j<str.length();j++){
					
					if(current.equals(str.substring(j,j+1))){
								icount++;
					}
				}
				checked = checked + current;
				System.out.println("Char " + current + " occurs " + icount + " times"  );
			}
		}

	}

}
