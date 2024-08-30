package javaQuadraticEquation;

import java.util.Scanner;

public class Solution {

  static void solution() {
    int a, b, c, firstTerm, thirdTerm;
    double secondTerm, firstSolution, secondSolution;

    Scanner in = new Scanner(System.in);
    a = in.nextInt();
    b = in.nextInt();
    c = in.nextInt();

    firstTerm = -b;
    secondTerm = Math.sqrt(power(b, 2) - (4 * a * c));
    thirdTerm = 2 * a;

    firstSolution = (firstTerm + secondTerm) / thirdTerm;
    secondSolution = (firstTerm - secondTerm) / thirdTerm;

    System.out.printf("%.4f\n", firstSolution); //format the result to four decimals
    System.out.printf("%.4f", secondSolution);
  }

  static int power(int base, int exponent) { //calculate the exponential term
    int res = 1;

    for (int i = 1; i <= exponent; i++) {
      res *= base;
    }
    return res;
  }

  public static void main(String[] args) {
    solution();
  }
}
