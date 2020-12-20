package javaHackathon;

import java.util.Scanner;

public class Q1Boolean {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the boolean value for a=");
		boolean a=sc.nextBoolean();
		System.out.println("Enter the boolean value for b=");
		boolean b=sc.nextBoolean();
		System.out.println("Enter the boolean value for c=");
		boolean c=sc.nextBoolean();
		sc.close();
		int icount=0;
		if (a==true){
			icount=icount+1;
		}
        if(b==true){
        	icount=icount+1;
        }
        if(c==true){
        	icount=icount+1;
        }
     if(icount>=2){
    	 System.out.println("Atleast two variables are true");
     }else{
    	 System.out.println("Less than two variables are  true");
     }
	}

}
