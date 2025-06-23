package com.basic.array;

import java.util.ArrayList;
import java.util.List;

public class FindTheDuplicateElmentIntoArrayByusingauxiliary {
	static int[] findDuplicates(int[] arr) {

        int n = arr.length;
        int[] freqArr = new int[n]; 
        List<Integer> result = new ArrayList<>();

        // Step 2: Iterate through the array
        // and count element frequencies
        for (int i = 0; i < n; i++) {
        	int m=arr[i];
            freqArr[arr[i]]++;
        }

        // Step 3: Iterate through all the possible
        // elements to check duplicates
        for (int i = 0; i < n; i++) {
            if (freqArr[arr[i]] > 1) {
                result.add(arr[i]);
                freqArr[arr[i]]
                    = 0; // To avoid adding duplicates again
            }
        }

        // Step 4: If no duplicates found, add -1 to the
        // result
        if (result.isEmpty()) {
            result.add(-1);
        }

        // Convert the result list to an array and return
        return result.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {

        int[] arr = { 1, 6, 5, 2, 3, 3, 2 };
        int[] duplicates = findDuplicates(arr);

        for (int element : duplicates) {
            System.out.print(element + " ");
        }
}
}