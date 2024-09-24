package javaLongestCommonPrefix;

import java.util.Arrays;

class Solution_2 {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        int len = strs.length;
        String first = strs[0];
        String last = strs[len - 1];
        String res = "";
        for (int i = 0; i < Math.min(first.length(), last.length()); i++) {
            if (first.charAt(i) != last.charAt(i)) {
                return res;
            }
            res += first.charAt(i);
        }
        return res;
    }
}