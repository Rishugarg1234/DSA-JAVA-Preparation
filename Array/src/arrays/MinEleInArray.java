package arrays;

import java.util.Scanner;

public class MinEleInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in array: ");
        int n = sc.nextInt();
        int [] arr = new int [n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int min = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("The minimum element of the array : "+min);
    }
}
/*
Problem: Find Minimum Element in an Array
Platform: DSA Practice

Description:
Find the smallest element present in the array.

Approach:
Initialize min with Integer.MAX_VALUE.
Traverse the array and update min whenever a smaller element is found.

Time Complexity: O(n)
Space Complexity: O(1)
*/
