package com.dsa2;
public class Compressed {
	public static String compressString(String input) {
	    if (input == null || input.length() == 0) {
	        return "";
	    }

	    StringBuilder compressed = new StringBuilder();
	    char prevChar = input.charAt(0);
	    int count = 1;

	    for (int i = 1; i < input.length(); i++) {
	        char currentChar = input.charAt(i);
	        if (currentChar == prevChar) {
	            count++;
	        } else {
	            compressed.append(prevChar);
	            if (count > 1) {
	                compressed.append("*").append(count); // Append count directly
	            }
	            prevChar = currentChar;
	            count = 1;
	        }
	    }

	    compressed.append(prevChar);
	    if (count > 1) {
	        compressed.append("*").append(count); // Append count directly
	    }

	    return compressed.toString();
	}

    public static void main(String[] args) {
        String[] testCases = {"AAAAA", "ABABCABABCD", "ABABC", "abcd", "aaaabbbb", "abcba", "aaaaaaa.a"};
        for (String input : testCases) {
            System.out.println("Input: " + input + " Output: " + compressString(input));
        }
    }
}
