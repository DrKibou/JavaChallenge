package javaPalindrome;

import java.util.Scanner;

public class Solution_2 {

  static void solution(String A) {
    String temp = "";
    boolean isLowerCase = true;

    for (int i = A.length() - 1; i >= 0; i--) { // reverse the string
      if (A.length() <= 50 && A.charAt(i) >= 'a' && A.charAt(i) <= 'z') { //check it is less than 50 and if indexes is in lower case english letters
        temp = temp + "" + A.charAt(i);
      } else {
        System.out.println("Invalid. Check the constraint."); //print error
        isLowerCase = false;
        break;
      }
    }
    if (isLowerCase) {
      if (A.equals(temp)) { //compare the reversed and original string and if is less than or equal to 50
        System.out.println("Yes");
      } else {
        System.out.println("No");
      }
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String A = sc.next();
    solution(A);
  }
}
