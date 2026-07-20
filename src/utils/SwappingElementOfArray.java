package utils;

import java.util.Arrays;
import java.util.Scanner;

public class SwappingElementOfArray {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = ArrayInput.arrayInput(sc);
        System.out.print("Enter index 1 to be swapped: ");
        int index1 = sc.nextByte();
        System.out.print("Enter Index 2 to be swapped: ");
        int index2 = sc.nextByte();
        swap(arr, index1, index2);
        System.out.println(Arrays.toString(arr));
    }

    public static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
