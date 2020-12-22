package javaHackathon;

import java.util.Scanner;

public class Q24NaturalNumber1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        sc.close();
        int sum = 0 , j = 0 ;
        for(int i=1; i<n; i++)
        {
            sum = i;
            j = i+1;
            while(sum < n)
            {
                sum = sum + j;
                j++;
            }
            if(sum == n)
            {
                for(int k=i; k<j; k++)
                {
                    if(k==i)
                        System.out.print(k);
                    else
                        System.out.print(" + "+k);
                }
                System.out.println();
            }
        }

	}

}
