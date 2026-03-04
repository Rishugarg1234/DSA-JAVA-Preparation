package arrays;

import java.util.Scanner;

public class SecondLargestEle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of element in array: ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>max1){
                max2=max1;
                max1=arr[i];
            }
            else if(arr[i]>max2 && arr[i]!=max1){
                max2 = arr[i];
            }
        }
        if(max2 == Integer.MIN_VALUE){
            System.out.println("No second largest");
        }
        else{
            System.out.println("The second largest element of the array is: "+max2);
        }
    }
}
/*
Problem: Find Second Largest Element in an Array
Platform: DSA Practice

Description:
Find the second largest unique element in the array.

Approach:
Maintain two variables:
max1 → largest element
max2 → second largest element

Traverse the array and update them accordingly.

Time Complexity: O(n)
Space Complexity: O(1)
*/