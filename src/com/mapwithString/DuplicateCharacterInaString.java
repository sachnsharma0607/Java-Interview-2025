package com.mapwithString;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharacterInaString {
	public static void main(String[] args) {
		DuplicateCharacterInaString.duplicateCharacter("this is the india");

	}

	public static void duplicateCharacter(String str) {
		Map<Character, Integer> dupmap = new HashMap<>();

		char[] ch = str.toCharArray();
		for (Character c : ch) {

			if (!dupmap.containsKey(c)) {
				dupmap.put(c, 1);
			} else {
				dupmap.put(c, dupmap.get(c) + 1);
			}

		}
		Set<Character> keyset = dupmap.keySet();

		for (Character c : ch) {
			if (dupmap.get(c) == 1) {
				System.out.println(c);
				break;
			}
		}
	}
}
