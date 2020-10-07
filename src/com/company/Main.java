package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int count = 0;
        int a[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < m; j++) {
                    a[i][j] = count;
                    count++;
                }
            }
            else {
                for (int j = m - 1; j > -1; j--) {
                    a[i][j] = count;
                    count++;
                }
            }
        }
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("%3d", a[i][j]);
            }
            System.out.println();
        }
    }
}