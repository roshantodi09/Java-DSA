package Loops;

import java.util.Scanner;

/*
 * Problem: Inverted Right Pyramid Star Pattern
 * Package: Loops
 * Difficulty: Easy
 *
 * Approach:
 * 1. Take the height of the pyramid as input.
 * 2. Use the outer loop to iterate from the last row to the first row.
 * 3. Use the inner loop to print '*' equal to the current row number.
 * 4. Print a new line after completing each row.
 *
 * Time Complexity: O(n²)
 * Space Complexity: O(1)
 */

public class InvertedRightPyramid {

    public static void main(String[] args) {

        // Create Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Input the height of the pyramid
        System.out.print("Enter length: ");
        int n = sc.nextInt();

        // Close Scanner to release system resources
        sc.close();

        /*
         * Outer loop controls the number of rows.
         * It starts from 'n' and decreases to 1.
         */
        for (int i = n; i >= 1; i--) {

            /*
             * Inner loop prints '*' equal to the current row number.
             * For row i, it executes 'i' times.
             */
            for (int j = i; j >= 1; j--) {
                System.out.print("* ");
            }

            // Move to the next line after printing one complete row
            System.out.println();
        }
    }
}

/*
 * -----------------------------
 * Time Complexity (TC): O(n²)
 * -----------------------------
 * - Outer loop runs 'n' times.
 * - Inner loop runs n + (n-1) + ... + 1 times.
 * - Total operations = n(n + 1) / 2.
 * - Ignoring constants, TC = O(n²).
 *
 * -----------------------------
 * Space Complexity (SC): O(1)
 * -----------------------------
 * - No extra data structures are used.
 * - Only a few integer variables are utilized.
 */