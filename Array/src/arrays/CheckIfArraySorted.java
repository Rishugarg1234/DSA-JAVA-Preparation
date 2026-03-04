package arrays;

import java.util.Scanner;

public class CheckIfArraySorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in array: ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        boolean isSorted = true;
        for(int i=0;i<n-1;i++){
            if(arr[i] > arr[i+1]){
                isSorted = false;
                break;
            }
        }
        if(isSorted){
            System.out.print("The array is sorted");
        }
        else{
            System.out.println("The array is not sorted");
        }
    }
}
/*
Problem: Check if Array is Sorted
Platform: DSA Practice

Description:
Determine whether the given array is sorted in ascending order.

Approach:
Traverse the array and compare each element with the next element.
If any element is greater than the next, the array is not sorted.

Time Complexity: O(n)
Space Complexity: O(1)
*/