package com.company;
import java.util.Scanner;
public class Power2 {

    public static void main(String[] args){

        int m, n, result = 1;
        System.out.println("Enter Number");
        Scanner r = new Scanner(System.in);
        m = r.nextInt();

        System.out.println("Enter Power");
        n = r.nextInt();

         for (int i = 1; i <= n; i++){
             result = m * result;
         }
        System.out.println("Power" + result);
    }
}
