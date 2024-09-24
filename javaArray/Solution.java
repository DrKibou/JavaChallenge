package javaArray;

class Solution {
    public int[] rearrangeArray(int[] nums) {
        int len = nums.length;
        int[] result = new int[len];
        int posIndex = 0;
        int negIndex = 1;

        for (int num : nums) {
            if (num > 0) {
                result[posIndex] = num;
                posIndex += 2;
            } else {
                result[negIndex] = num;
                negIndex += 2;
            }
        }

        return result;
    }
}