package com.company;

public class ThreeIntegerAddsToZero {
    static void tripleZero(int[] arr) {
        boolean isSumZero = false;
        int n = arr.length;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] + arr[j] + arr[k] == 0) {
                        System.out.print("arr[i]" + arr [i] + " " + "arr[j]" + arr [j] +" " + "arr[k]" + arr[k] +"\n");
                        isSumZero = true;
                    }
                }
            }
        }


            if (isSumZero == false)

                System.out.println(" not exist ");

        }

        public static void main (String[]args)
        {
            int arr[] = {0, -1, 2, -3, 1};

            tripleZero(arr);

        }

    }


