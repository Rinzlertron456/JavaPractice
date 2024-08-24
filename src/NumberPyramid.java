//Problem 2: Number Pyramid
//Description
//Write a Java program that prints a pyramid of numbers based on the given input n.
//Input
//• An integer n (1 ≤ n ≤ 20)
//Output
//• Print a pyramid of numbers with n rows.
//Example
//Input
//Enter n value:
//5
//Output
//    1
//   121
//  12321
// 1234321
//123454321

import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < (n-i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j < i+1; j++) {
                System.out.print(j);
            }
            for (int j = i+1; j > 0; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
