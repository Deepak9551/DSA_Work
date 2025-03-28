package com.Spring.took.Array;

import java.util.Arrays;

public class TrapWater {
    public static void main(String[] args) {
        int[] height = {4,2,0,6,3,2,5};
        System.out.println("Maximum water that can be trapped is " + trap(height));
        trapWaterByTwoPointer(height);
    }

    public static int trap(int[] height) {
        int n = height.length;
        if(n==0) return 0;
        int leftMax[] = new int[n];
        int rightMax[] = new int[n];
        leftMax[0] = height[0];
        rightMax[n-1] = height[n-1];
        for(int i=1; i<n; i++) {
            leftMax[i] = Math.max(leftMax[i-1], height[i]);
        }
        System.out.println(Arrays.toString(leftMax)  );
        for(int i=n-2; i>=0; i--) {
            rightMax[i] = Math.max(rightMax[i+1], height[i]);
        }
        System.out.println(Arrays.toString(rightMax)  );
        int water = 0;
        for(int i=1; i<=n-2; i++) {
            water += Math.min(leftMax[i], rightMax[i]) - height[i];
        }
        return water;
    }

    private static void trapWaterByTwoPointer(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        int maxLeft = arr[0];
        int maxRight = arr[arr.length - 1];
        int water = 0;
        while(left < right) {
            if(maxLeft < maxRight) {
                left++;
                maxLeft = Math.max(maxLeft, arr[left]);
                water += maxLeft - arr[left];

            }
            else {
                right--;
                maxRight = Math.max(maxRight, arr[right]);
                water += maxRight - arr[right];
            }

        }
        System.out.println(water);
    }
}
