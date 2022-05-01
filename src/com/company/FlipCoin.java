package com.company;

public class FlipCoin {

    public static void main (String[] args){


        int headCount = 0;
        int tailCount=0;
        int i=0;
        while(i<=10)
        {
            double d = Math.random();
                    if(d<0.5){
                        tailCount++;
                        System.out.println("tail");
                    }
                    else{
                        headCount++;
                        System.out.println("head");

                    }
                    i++;
        }
        double headPercent = (double)headCount/(headCount + tailCount ) * 100;
    double tailPercent = (double)tailCount/(headCount + tailCount ) * 100;
        System.out.println("head percent " +headPercent);
        System.out.println("tail percent " +tailPercent);

    }
    }

