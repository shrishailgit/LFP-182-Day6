package com.functional;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {

        int number, reverse = 0;
        Scanner s = new Scanner(System.in);
        number = s.nextInt();
        while(number != 0)
        {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number/10;
        }
        System.out.println("The reverse of the given number is: " + reverse);
    }

}
