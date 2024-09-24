package javaLengthOfLastWord;

class Solution {
    public int lengthOfLastWord(String s) {
        String regex = "[\\s]";
        String [] arr = s.split(regex);
        int len = arr.length;

        String lastWord = arr[len - 1];

        int last_len = lastWord.length();

        return last_len;
    }
}