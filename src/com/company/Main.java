package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        double[] numbers = {15.45, 10.10, -2.1, 1.1, -88.544, -484.44, 3.1, -5.5, 88.4, 484.44, -48498.988, 78.89, 77.88, 89.3, 1.45, 55.44};
        double sum = 0;
        int num = 0;
        boolean negative = false;
        for (double d : numbers) {
            if (d < 0) {
                negative = true;
            } else {
                if (negative) {
                    num++;
                    sum += d;
                }
            }


        }
        System.out.println("Average " + sum / num);



    }


























}