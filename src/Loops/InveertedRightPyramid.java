package Loops;

import java.util.Scanner;

public class InveertedRightPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        int n = sc.nextInt();
        sc.close();
        for (int i = 5; i >= 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
