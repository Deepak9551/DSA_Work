package com.Spring.took.pattern;

import java.util.Scanner;

public class solid_half_diamond {
    public static void main(String[] args) {
        Scanner sc   = new Scanner(System.in);
        int n = sc.nextInt();

        for (int    row = 0; row< 2*n-1; row++) {
            int condition  ;
            if (row < n) {
                condition = row;
            } else  {
              condition = (n - row % n ) - 2;
            }
            for (int col = 0; col < condition   + 1 ; col++) {
                System.out.print("X");
            }
            System.out.println();
        }
    }
}
