package com.Spring.took.Array;

public class UniqueElement {

public static int findUniqueElement(int[] arr) {
    int n = arr.length;
    int xorResult = 0;
    for (int i = 0; i < n; i++) {
        xorResult = xorResult ^ arr[i];
    }
    return xorResult;  // The unique element is the XOR result.
}
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,3,4,4,5,5,6,7,7,8,8,9,9,10,10};
        int uniqueElement = findUniqueElement(arr);
        System.out.println("The unique element is: " + uniqueElement);
    }
}
