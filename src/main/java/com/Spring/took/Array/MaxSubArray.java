package com.Spring.took.Array;




public class MaxSubArray {
    public static void main(String[] args) {


MaxSubArray.maxSubArray(new int[]{-2,-3,4,-1,-2,1,5,-3});
        MaxSubArray.kadaneAlgorithm(new int[]{-2,-3,4,-1,-2,1,5,-3});
    }

    public static void maxSubArray(int[] arr){

        int maxSum = Integer.MIN_VALUE;


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

    public static void kadaneAlgorithm(int[] arr){
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;

        boolean allNegative = true;
        for (int i = 0; i < arr.length; i++) {
        if (arr[i] > 0) {
            allNegative = false;
            break;
        }
        }

        if (allNegative) {

            for (int i = 0; i < arr.length; i++) {
                maxSum = Math.max(maxSum, arr[i]);
            }
        }
        if (!allNegative) {
            for (int i = 0; i < arr.length; i++) {
                currentSum += arr[i];
                if (currentSum < 0) {
                    currentSum = 0;
                }

                maxSum = Math.max(maxSum, currentSum);
            }
        }
        System.out.println( "Maximum subarray sum: " + maxSum);
    }
}
