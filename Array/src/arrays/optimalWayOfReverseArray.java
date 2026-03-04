package arrays;

import java.util.Scanner;

public class optimalWayOfReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int start = 0;
        int end = n - 1;

        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        System.out.println("Reversed array:");

        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
/*
Problem: Reverse an Array
Platform: DSA Practice

Approach:
Use two pointers (start and end) and swap elements
until start crosses end.

Time Complexity: O(n)
Space Complexity: O(1)
*/