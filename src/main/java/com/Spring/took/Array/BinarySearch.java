package com.Spring.took.Array;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50, 60, 70};

        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        int st = 0;
        int ed = arr.length - 1;

        while (st <= ed) {
            int mid = (st + ed) / 2;
           if (key == arr[mid]) {
                System.out.println("element found at " + arr[mid]);
                break;
            }

           else if (key < arr[mid]) {
                ed = mid - 1;

            } else {
                st = mid + 1;
            }
        }
    }
    }
