package com.company;
    import java.util.Scanner;
    public class Prgm2DArray {

        public static void main(String[] args) {
            int M, N, i, j;
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter M for the array: ");
            M = sc.nextInt();
            System.out.print("Enter N for the array: ");
            N = sc.nextInt();
            int[][] arr = new int[M][N];
            System.out.println("Enter " + (M * N) + " Array Elements : ");
            for (i = 0; i < M; i++) {
                for (j = 0; j < N; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }

            System.out.print("The Array is :\n");
            for (i = 0; i < M; i++) {
                for (j = 0; j < N; j++) {
                    System.out.print(arr[i][j] + "  ");
                }
                System.out.println();
            }
        }
    }


