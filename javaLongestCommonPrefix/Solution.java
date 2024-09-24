package javaLongestCommonPrefix;

import java.util.*;

public class Solution {
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        // Array to store common prefixes, with size of (n * (n - 1)) / 2 for all possible pairs
        int n = strs.length;
        String[] commonPrefixes = new String[(n * (n - 1)) / 2];
        int index = 0;  // To keep track of where we are in the array

        // Compare each pair of strings to find common prefixes
        for (int i = 0; i < strs.length; i++) {
            for (int j = i + 1; j < strs.length; j++) {
                String commonPrefix = findCommonPrefix(strs[i], strs[j]);
                if (!commonPrefix.isEmpty()) {
                    commonPrefixes[index++] = commonPrefix;
                }
            }
        }

        // Find the longest common prefix from the array
        String longestPrefix = "";
        for (int i = 0; i < index; i++) {
            if (commonPrefixes[i].length() > longestPrefix.length()) {
                longestPrefix = commonPrefixes[i];
            }
        }

        return longestPrefix;
    }

    // Helper function to find the common prefix between two strings
    private static String findCommonPrefix(String s1, String s2) {
        int minLength = Math.min(s1.length(), s2.length());
        int i = 0;
        while (i < minLength && s1.charAt(i) == s2.charAt(i)) {
            i++;
        }
        return s1.substring(0, i);
    }

    public static void main(String[] args) {
        String[] strs = { "flower", "flow", "flight", "green" };
        String result = longestCommonPrefix(strs);

        // Output the result
        if (!result.isEmpty()) {
            System.out.println("Longest Common Prefix: " + result);
        } else {
            System.out.println("No common prefix.");
        }
    }
}
