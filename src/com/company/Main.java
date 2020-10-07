package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int count = 0;
        int bottom_y = n, bottom_x = n, top_y = n, top_x = n;
        int current_x = n, current_y = n;
        int a[][] = new int[2 * n + 1][2 * n + 1];
        while (!(current_x == 2 * n && current_y == 0)) {
            while (current_y >= bottom_y && !(current_x == 2 * n && current_y == 0)) {
                a[current_x][current_y] = count;
                count++;
                current_y--;
            }
            bottom_y = current_y;
            while (current_x >= bottom_x && !(current_x == 2 * n && current_y == 0)) {
                a[current_x][current_y] = count;
                count++;
                current_x--;
            }
            bottom_x = current_x;
            while (current_y <= top_y && !(current_x == 2 * n && current_y == 0)) {
                a[current_x][current_y] = count;
                count++;
                current_y++;
            }
            top_y = current_y;
            while (current_x <= top_x && !(current_x == 2 * n && current_y == 0)) {
                a[current_x][current_y] = count;
                count++;
                current_x++;
            }
            top_x = current_x;
        }
        a[2 * n][0] = count;
        for (int i = 0; i < 2 * n + 1; i++) {
            for (int j = 0; j < 2 * n + 1; j++) {
                System.out.printf("%3d", a[j][i]);
            }
            System.out.println();
        }
    }
}