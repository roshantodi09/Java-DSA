package Loops;

import java.util.Scanner;

public class RightAngledTriangle {
    public static void main(String[] args) {
        // Create Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Input length
        System.out.print("Enter length: ");
        int n = sc.nextInt();
        sc.close();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
