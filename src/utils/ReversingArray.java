package utils;

import java.util.Scanner;

public class ReversingArray {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = ArrayInput.arrayInput(sc);

        reverse(arr, 0, arr.length-1);
    }

    public static void reverse(int[] arr, int left, int right) {

        while (left< right) {
            SwappingElementOfArray.swap(arr, left, right);
            left++;
            right--;
        }

    }
}
