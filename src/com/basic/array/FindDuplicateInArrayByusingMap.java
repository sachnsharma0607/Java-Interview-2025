package com.basic.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindDuplicateInArrayByusingMap {

	static List<Integer> findDuplicates(List<Integer> arr) {
	      
        // Find frequency of every element
        Map<Integer, Integer> freq = new HashMap<>();
        for (int x : arr) {
            freq.put(x, freq.getOrDefault(x, 0) + 1);
        }

        // Move all those elements to result that
        // have frequency more than 1.
        List<Integer> res = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            if (entry.getValue() > 1) {
                res.add(entry.getKey());
            }
        }

        return res;
    }

    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(12, 11, 40, 12, 5, 6, 5, 12, 11);
        List<Integer> res = findDuplicates(arr);
        for (int x : res) {
            System.out.print(x + " ");
        }
    }
}
