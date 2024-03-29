package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
// Input: n = 234
// Output: 15
// Explanation:
// Product of digits = 2 * 3 * 4 = 24
// Sum of digits = 2 + 3 + 4 = 9
// Result = 24 - 9 = 15
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = 0;
        int l = 1;
        while (n != 0) {
            k = k + n % 10;
            l*= n % 10;
            n = n / 10;
        }
        int sum = l-k;
        System.out.println(sum);
    }
}