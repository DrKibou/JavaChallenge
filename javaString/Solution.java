package javaString;
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        int sum = A.length() + B.length(); //sums the length of the strings
        String isGreater = ""; //holds the result whether the A is lexicographically greater than B 
        String aUpperCase = "" + A.charAt(0); //separate first letter of the strings
        String bUpperCase = "" + B.charAt(0);
        String aString = ""; //holds the rest of the element of the strings
        String bString = "";

        for(int i = 0; i < A.length(); i++){ //compare each index and return if greater than or not
            if (A.charAt(i) != B.charAt(i)){
                int asciiA = (int) A.charAt(i); //convert to ascii
                int asciiB = (int) B.charAt(i);       
                isGreater = (asciiA > asciiB) ? "Yes" : "No";
                break;
            } else {
                isGreater = "No";
            }
        }
        for(int i = 1; i < A.length(); i++){ //concantenate the second to the last element of the strings
            aString += A.charAt(i);
        }
        for(int i = 1; i < B.length(); i++){
            bString += B.charAt(i);
        }
        
        System.out.println(sum + "\n" +isGreater + "\n" + aUpperCase.toUpperCase() + aString +" "+ bUpperCase.toUpperCase() + bString); //print result
        
    }
}



