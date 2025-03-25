package com.Spring.took.Array;

public class Subarray {
public static  void calSubArray(int[] n){
    for (int i = 0; i < n.length; i++) {

        for (int j = 0; j <=i; j++) {
//            System.out.print("( "+n[i]+","+n[j]+" )");

//            for (int k = i; k <=j; k++) {
//                System.out.print(n[k]);
//            }
//            System.out.println();
            System.out.print(n[j]);
        }
        System.out.println();
    }
}

    public static void main(String[] args) {
        Subarray.calSubArray(new int[]{2,3,4,5,6,7,8});
    }
}
