package arrays;

import java.util.Scanner;

public class MaxEleInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("The maximum element of the array: "+max);
    }
}
/*
Problem: Find Maximum Element in an Array
Platform: DSA Practice

Description:
Find the largest element present in the array.

Approach:
Initialize max with Integer.MIN_VALUE.
Traverse the array and update max whenever a larger element is found.

Time Complexity: O(n)
Space Complexity: O(1)
*/