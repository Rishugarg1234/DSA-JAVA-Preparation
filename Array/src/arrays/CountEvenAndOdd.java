package arrays;

import java.util.Scanner;

public class CountEvenAndOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in array: ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int evenCount = 0;
        int oddCount = 0;
        for(int i=0;i<n;i++){
            if(arr[i]%2 == 0){
                evenCount++;
            }
            else{
                oddCount++;
            }
        }
        System.out.print("The even number count in array : "+evenCount);
        System.out.print("\nThe odd number count in array : "+oddCount);
    }
}
/*
Problem: Count Even and Odd Numbers in an Array
Platform: DSA Practice

Description:
Count how many elements in the array are even and how many are odd.

Approach:
Traverse the array and check each element using modulus operator (%).
If element % 2 == 0 → even
Else → odd

Time Complexity: O(n)
Space Complexity: O(1)
*/