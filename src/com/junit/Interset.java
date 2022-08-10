package com.junit;

import java.util.Scanner;

public class Interset {

	static double monthlyPayment(int Y,float P, float R){
        float r;
        float n = 12 * Y;
        r = R / (12 * 100);
        float I;
        float t = (float) (1 - Math.pow((1 + r) ,(-n)));
        float t1 = P * r;
        I = t1/t;
        System.out.println(I);
        return I;
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int Y;
        float R,P;
        Y = s.nextInt();
     //   R = s.nextDouble();
      //  P = s.nextDouble();
        //monthlyPayment(Y,P,R);

    }
}
