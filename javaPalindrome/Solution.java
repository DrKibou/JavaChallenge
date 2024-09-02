package javaPalindrome;

import java.util.Scanner;

public class Solution {

  static void solution(int x) {
    int remainder;
    int temp = x;
    int reverse = 0;

    while (x > 0) { //reverse the integer
      remainder = x % 10;
      reverse = reverse * 10 + remainder;
      x /= 10;
    }

    if (temp == reverse) { //compare the original and the reverse integer
      System.out.println(true);
    } else {
      System.out.println(false);
    }
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int x = in.nextInt();
    solution(x);
  }
}
