package com.dsa.substrings;
import java.util.HashMap;
import java.util.Map;

class NFA {

    public static String compressString(String s) {
        int n = s.length();
        String[] dp = new String[n + 1];
        dp[0] = "";

        for (int i = 1; i <= n; i++) {
            dp[i] = s.substring(0, i); // worst case: no compression
            for (int j = 0; j < i; j++) {
                String repeat = s.substring(j, i);
                if (i % (i - j) == 0 && repeat.equals(s.substring(0, i - j))) {
                    String candidate = dp[j] + "*";
                    if (candidate.length() < dp[i].length()) {
                        dp[i] = candidate;
                    }
                } else {
                    String candidate = dp[j] + s.charAt(j);
                    if (candidate.length() < dp[i].length()) {
                        dp[i] = candidate;
                    }
                }
            }
        }

        return dp[n];
    }

    public static void main(String[] args) {
        String[] testCases = {"AAAA", "AAA", "AAAAA", "ABABCABABCD", "ABABC", "abcd", "aaaabbbb", "abcba", "aaaaaaa.a"};
        for (String testCase : testCases) {
            System.out.println("Input: " + testCase);
            System.out.println("Output: " + compressString(testCase));
        }
    }
}
