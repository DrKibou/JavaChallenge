package javaDiamondPattern;

import java.util.Scanner;

public class Solution {

  static void diamondPattern(int n) {
    for (int i = 1; i < n; i++) {
      for (int j = 0; j < n - i; j++) {
        System.out.print(" ");
      }
      int k = 0;
      while (k != i * 2 - 1) {
        System.out.print("*");
        k++;
      }
      System.out.println();
    }

    for (int i = n - 2; i > 0; i--) {
      for (int j = n - i; j > 0; j--) {
        System.out.print(" ");
      }
      int k = 0;
      while (k != i * 2 - 1) {
        System.out.print("*");
        k++;
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();

    diamondPattern(n);
  }
}
