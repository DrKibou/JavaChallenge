package javaSubstring;

import java.util.Scanner;

public class Solution {

  static boolean isAlphabeticLetters(String S, int len) { //checks if the string contains only alphabetic letters.
    boolean isAlphabeticLetters = true;
    for (int i = 0; i < len; i++) {
      if (
        S.charAt(i) >= 'a' &&
        S.charAt(i) <= 'z' ||
        S.charAt(i) >= 'A' &&
        S.charAt(i) <= 'Z'
      ) {
        isAlphabeticLetters = true;
      } else {
        isAlphabeticLetters = false;
        System.out.println("Invalid String. Alphabetic letters only.");
        break;
      }
    }
    return isAlphabeticLetters;
  }

  static void answer(String S, int start, int end, int len) {
    String res = " ";
    if (isAlphabeticLetters(S, len) && len >= 1 && len <= 100) { //checks the second constraint (1<=|s|>=100)
      res = S.substring(start, end); //inclusive range
    }
    System.out.println(res); //print result
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String S = in.next();
    int start = in.nextInt();
    int end = in.nextInt();
    int len = S.length();

    answer(S, start, end, len);
  }
}
