package javaHaystackAndNeedle;

class Solution {
    public int strStr(String haystack, String needle) {
        int hlen = haystack.length();
        int nlen = needle.length();
        if (hlen < nlen)
            return -1;
        for (int i = 0; i <= hlen - nlen; i++) {
            int count = 0;
            for (int j = 0; j < nlen && haystack.charAt(i + j) == needle.charAt(j); j++) {
                count++;
                if (count == nlen) {
                    return i;
                }
            }
        }
        return -1;
    }
}
