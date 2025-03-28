package com.Spring.took.Array;

import java.util.Arrays;

public class CountSort {
    public static void main(String[] args) {
        int[] arr = {0,2,2,2,2,1,0,0,0,2,1,0};
        countSort(arr);
        System.out.println("Sorted array in descending order:");

    }
    public static void swap(int [] arr,  int a , int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;

    }

    public static void countSort(int[] arr) {
        int m = 0;
        int h = arr.length -1 ;
        int l = 0;



        while (m <= h){
            if(arr[m] == 0){
                swap(arr, m, l );
                l++;
                m++;
            }
            else if(arr[m] == 1){
                m++;
            }
            else{
                swap(arr, m, h);
                h--;
            }
        }
        System.out.println( Arrays.toString(arr));;
    }
}
