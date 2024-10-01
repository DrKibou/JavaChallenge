package javaPlusOne;

class Solution {
    public int[] plusOne(int[] digits) {
        int len = digits.length;
        int new_digits[] = new int[len + 1];
        int last_digit = digits[len - 1];

        int carry = 1;
        for (int i = len - 1; i >= 0; i--) {
            if (last_digit < 9) {
                digits[i]++;
                return digits;
            } else if (digits[i] == 9 && carry != 0) {
                new_digits[i + 1] = 0;
                carry = 1;
            } else {
                new_digits[i + 1] = digits[i] + carry;
                carry = 0;
            }
        }

        new_digits[0] = carry;

        if (new_digits[0] == 0) {
            for (int i = 1; i < new_digits.length; i++) {
                digits[i - 1] = new_digits[i];
            }
            return digits;
        }

        return new_digits;
    }
}