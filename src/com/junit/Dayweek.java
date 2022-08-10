package com.junit;

import java.util.Scanner;

public class Dayweek {

	public static int dayOfWeek(int m,int d, int y){
        int y1 = y - (14 - m) / 12;
        int x = y1 + y1 / 4 - y1 / 100 + y1 / 400;
        int m1 = m + (12 * x) * ((14 - m) / 12) - 2;
        int d1 = (d + x + (31 * m1) / 12) % 7;
        return d1;
    }
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        int d = s.nextInt();
        int y = s.nextInt();

        int k = dayOfWeek(m,d,y);
        switch(k){
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6 :
                System.out.println("Saturday");
                break;

        }

    }
}

