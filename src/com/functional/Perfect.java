package com.functional;

import java.util.Scanner;

public class Perfect {
	public static void main(String[] args)
    {
        int n, s=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        n=sc.nextInt();
        int i=1;
        while(i <= n/2)
        {
            if(n % i == 0)
            {
                s = s + i;
            }
            i++;
        }
        if(s==n)
        {
            System.out.println(n+" is a perfect number.");
        }
        else
            System.out.println(n+" is not a perfect number.");
    }

}
