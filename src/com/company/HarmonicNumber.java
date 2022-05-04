package com.company;
import java.util.Scanner;
public class HarmonicNumber {

    public static void main(String[] args) {

        double result = 0, num = 0, i;
        int n;
        Scanner r = new Scanner(System.in);

        System.out.println("Enter the Harmonic No.you want to find: ");
        n = r.nextInt();

        for (i= 1; i<=n; i++) {
            num = num + (1 / i);
            result = num;
        }
        System.out.println("The value of Harmonic no. " + n +" is: " + result);

        }

    }

