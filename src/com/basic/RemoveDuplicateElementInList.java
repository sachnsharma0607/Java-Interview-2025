package com.basic;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicateElementInList {
	public static void main(String[] args) {
		List<Object> items = List.of(0, 1, 1, 2, 3, 5, 6, 0, 0, 1);
		List<Object> deduped = new ArrayList<>();
		for (int i = 0; i < items.size(); i++) {
		  if (!deduped.contains(items.get(i)))
		    deduped.add(items.get(i));
		  }
		System.out.println(deduped);
		}
	

}

