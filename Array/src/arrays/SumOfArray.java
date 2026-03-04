package arrays;

import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in array: ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        System.out.println("The sum of the array is : "+sum);

    }
}
/*
Problem: Sum of Elements in an Array
Platform: DSA Practice

Description:
Calculate the sum of all elements present in the array.

Approach:
Traverse the array and add each element to a sum variable.

Time Complexity: O(n)
Space Complexity: O(1)
*/