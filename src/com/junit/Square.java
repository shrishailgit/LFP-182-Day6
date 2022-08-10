package com.junit;

import java.util.Scanner;

public class Square {
	static double squareRoot(double n, double l)
    {
        double x = n;
        double root;

        int count = 0;

        while (true)
        {
            count++;

            root = 0.5 * (x + (n / x));

            if (Math.abs(root - x) < x * l)
                break;

            x = root;
        }

        return root;
    }

    public static void main (String[] args)
    {
        double n ;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        double l = 0.000000000000001;

        System.out.println(squareRoot(n, l));
    }
}

