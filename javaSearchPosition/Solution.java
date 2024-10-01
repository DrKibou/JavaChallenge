package javaSearchPosition;

class Solution {
    public int searchInsert(int[] nums, int target) {
        int len = nums.length;
        int index = 0;
        for (int i = 0; i < len; i++) {
            if (nums[i] != target && target > nums[i]) {
                index = i + 1;
            } else {
                return i;
            }  
        }
        return index;
    }
}