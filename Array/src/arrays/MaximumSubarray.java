package arrays;

import java.util.Scanner;

/*
Problem: Maximum Subarray Sum (Kadane's Algorithm)
Platform: LeetCode / DSA Practice

Description:
Given an integer array, find the contiguous subarray
(within the array) which has the largest sum and return that sum.

Example:
Input:
[-2,1,-3,4,-1,2,1,-5,4]

Output:
6

Explanation:
The subarray [4,-1,2,1] has the maximum sum = 6

----------------------------------------------------------

Intuition Behind Kadane's Algorithm:

Instead of generating all possible subarrays (which would take O(n²) time),
Kadane's Algorithm efficiently finds the maximum subarray in a single pass.

At every element we decide:

1) Start a new subarray from the current element
2) Extend the previous subarray

We choose whichever gives the larger sum.

Formula used:
currentSum = max(current element, previousSum + current element)

Then we keep updating the best sum found so far.

----------------------------------------------------------

Why This Works:

If the running sum becomes negative,
it will reduce the sum of any future subarray.

So it is better to discard that negative prefix
and start a new subarray from the next element.

----------------------------------------------------------

Time Complexity: O(n)
We traverse the array only once.

Space Complexity: O(1)
No extra space is used apart from variables.

*/

public class MaximumSubarray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements of the array:");

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        /*
        currentSum -> stores the sum of the current subarray
        maxSum -> stores the maximum sum
        */

        int currentSum = arr[0];
        int maxSum = arr[0];

        /*
        For each element we decide:
        Should we start a new subarray
        OR
        Should we continue the existing subarray

        here arr[i] is option1(new array) and currentSum+arr[i] is option2(continue)
        */

        for(int i = 1; i < n; i++){
            // Decide whether to start a new subarray or extend the previous one
            currentSum = Math.max(arr[i], currentSum + arr[i]);
            // Update the maximum sum
            maxSum = Math.max(maxSum, currentSum);
        }
        System.out.println("Maximum Subarray Sum is: " + maxSum);
    }
}