package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a[][] = new int[n][n];
        boolean flag = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = scan.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            if (!flag) {
                break;
            }
            for (int j = 1; j < n - i; j++) {
                if (a[i][i + j] != a[i + j][i]) {
                    flag = false;
                    System.out.print("no");
                }
            }
        }
        if (flag) {
            System.out.print("yes");
        }
    }
}