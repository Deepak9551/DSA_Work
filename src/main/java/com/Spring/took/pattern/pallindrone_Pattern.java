package com.Spring.took.pattern;

public class pallindrone_Pattern {
    public static void main(String[] args) {
        int n = 5; // Change this value as needed

        for (int row = 0; row < n; row++) {
            int count = 1;  // Reset count for each row

            for (int col = 0; col < 2 * n - 1; col++) {
                if (col < n - row - 1) {
                    System.out.print("_"); // Print leading underscores
                }
                else if (col < n + row) {
                    System.out.print(count);
                    if (col < n - 1) {
                        count++;  // Increase count on left side
                    } else {
                        count--;  // Decrease count on right side
                    }
                }
                else {
                    System.out.print("_"); // Print trailing underscores
                }
            }
            System.out.println(); // New line after each row
        }
    }
}