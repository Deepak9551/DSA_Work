package com.Spring.took.Array;




public class PrefixSum {
    public static void main(String[] args) {


PrefixSum.maxSubArray(new int[]{1, -2, 3, 4, -1, 2, 1, -5, 4});
    }

    public static void maxSubArray(int[] arr){

        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        int[] prefixSum = new int[arr.length ];
        prefixSum[1] = arr[1];
        for(int i = 1; i < arr.length; i++){
            prefixSum[i] = prefixSum[i - 1]+ arr[i];
        }

        for(int start = 0; start < arr.length; start++){
            for (int end = 0; end < arr.length; end++) {
               maxSum = Math.max(maxSum, prefixSum[end] - prefixSum[start] + arr[start]);
            }
        }

        System.out.println("Maximum subarray sum: " + maxSum);
    }

}
