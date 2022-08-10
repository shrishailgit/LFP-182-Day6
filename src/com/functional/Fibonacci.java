package com.functional;

import java.util.Scanner;

public class Fibonacci {

	
	public static void main(String[] args) {

        Fibonacci fb = new Fibonacci();

        int previous = 0;
        int current = 1;

        System.out.println("enter the number for fibonacci series");
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();

        fb.printFibonacciNumbers(previous, current, count);

    }

    private int printFibonacciNumbers(int previous, int current, int count) {
        if (count == 0) {
            return 0;
        } else {
            System.out.print(previous + "\t");
        }
        return printFibonacciNumbers(current, previous + current, --count);
    }

}

