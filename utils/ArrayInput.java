import java.util.Arrays;
import java.util.Scanner;

public class ArrayInput {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(Arrays.toString(arrayInput(sc)));
    }

    public static int[] arrayInput(Scanner sc) {
        System.out.println("Enter Size Of Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter " +(i+1)+ " Element: ");
            arr[i] = sc.nextInt();
        }
        return arr;
    }
}
