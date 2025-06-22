package com.basic;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicateElementInList {
public static void main(String[] args) {
	List<Object> myList = List.of(0, 1, 1, 2, 3, 5, 6, 0, 0, 1, 5);
	Set<Object> duplicates = new HashSet<>();
	    Set<Object> set = new HashSet<>();

	for (Object i : myList) {
        if (set.contains(i)) {
            duplicates.add(i);
        } else {
            set.add(i);
        }
    }
    System.out.println(duplicates);
}
}
