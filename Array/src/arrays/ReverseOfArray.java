package arrays;

import java.util.Scanner;

public class ReverseOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in array: ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("The reverse of array is: ");
        for(int i = n-1; i>=0; i--){
            System.out.print(arr[i]+" ");
        }

    }
}
/*
Problem: Reverse an Array
Platform: DSA Practice

Description:
Print the elements of the array in reverse order.

Approach:
Traverse the array starting from the last index to the first index.

Time Complexity: O(n)
Space Complexity: O(1)
*/