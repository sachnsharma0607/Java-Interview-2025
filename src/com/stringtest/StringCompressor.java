package com.stringtest;

public class StringCompressor {

    public static String compressString(String input) {
        if (input == null || input.isEmpty()) {
            return ""; // Handle null or empty input
        }

        StringBuilder compressedString = new StringBuilder();
        int count = 1;

        for (int i = 0; i < input.length(); i++) {
            // Check if the current character is the same as the next one
            if (i + 1 < input.length() && input.charAt(i) == input.charAt(i + 1)) {
                count++; // Increment count for consecutive same characters
            } else {
                // Append the character and its count to the result
                compressedString.append(input.charAt(i));
                compressedString.append(count);
                count = 1; // Reset count for the next character sequence
            }
        }
        return compressedString.toString();
    }

    public static void main(String[] args) {
        String originalString = "aaabbbccc";
        String compressed = compressString(originalString);
        System.out.println("Original: " + originalString);
        System.out.println("Compressed: " + compressed); // Output: Compressed: a3b3c3
    }
}