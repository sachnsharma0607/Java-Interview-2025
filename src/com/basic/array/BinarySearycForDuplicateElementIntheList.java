package com.basic.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BinarySearycForDuplicateElementIntheList {

	// Returns index of the first occurrence of target
    static int lowerBound(int[] arr, int target) {
        int low = 0, high = arr.length;
        while (low < high) {
            int mid = (low + high) / 2;
            if (arr[mid] < target) 
                low = mid + 1;
          	else 
                high = mid;
        }
        return low; 
    }

    // Returns index just past the last occurrence of target
    static int upperBound(int[] arr, int target) {
        int low = 0, high = arr.length;
        while (low < high) {
            int mid = (low + high) / 2;
              if (arr[mid] <= target) 
                low = mid + 1;
          	else 
                high = mid;
        }
        return low; 
    }

    // Function to return elements that occur in arr more than once
    static List<Integer> findDuplicates(int[] arr) {   
        Arrays.sort(arr);  
        List<Integer> res = new ArrayList<>();  

        int i = 0;
        while (i < arr.length) { 
            int first = lowerBound(arr, arr[i]);
            int last = upperBound(arr, arr[i]) - 1;

            // If the element occurs more than once, add it to res
            if (last > first) {  
                res.add(arr[i]);  
            }
            
            // Update i to the last index of the current element
            i = last + 1;
        }
        return res;
    }

    public static void main(String[] args) {   
        int[] arr = {12, 40, 12, 5, 6, 5, 12,5,5,5,5, 5,5};   
        List<Integer> res = findDuplicates(arr);         
        for (int x : res) {
            System.out.print(x + " ");  
        }
    }
}
