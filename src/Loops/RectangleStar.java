package Loops;

import java.util.Scanner;

public class RectangleStar {

    public static void main(String[] args) {

        // Create Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Input number of rows
        System.out.print("Enter no of rows: ");
        int r = sc.nextInt();

        // Input number of columns
        System.out.print("Enter no of columns: ");
        int c = sc.nextInt();

        /*
         * Outer loop controls the number of rows.
         * It executes 'r' times.
         */
        for (int i = 1; i <= r; i++) {

            /*
             * Inner loop prints '*' in each column.
             * It executes 'c' times for every row.
             */
            for (int j = 1; j <= c; j++) {
                System.out.print("* ");
            }

            // Move to the next line after printing one complete row
            System.out.println();
        }

        // Close Scanner to release system resources
        sc.close();
    }
}

/*
 * -----------------------------
 * Time Complexity (TC): O(r × c)
 * -----------------------------
 * - Outer loop runs 'r' times.
 * - Inner loop runs 'c' times for each row.
 * - Total operations = r × c.
 *
 * -----------------------------
 * Space Complexity (SC): O(1)
 * -----------------------------
 * - No extra data structures are used.
 * - Only a few integer variables are utilized.
 */