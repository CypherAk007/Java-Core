package Basics;

import java.util.Scanner;

public class O11_TakeInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of arrays
        int n = Integer.parseInt(scanner.nextLine());

        // Create a 2D array to store the input arrays
        int[][] arrays = new int[n][];

        // Read each line and store it in the 2D array
        for (int i = 0; i < n; i++) {
            // Split the input line into parts and parse them as integers
            String[] line = scanner.nextLine().split(" ");
            int[] arr = new int[line.length];
            for (int j = 0; j < line.length; j++) {
                arr[j] = Integer.parseInt(line[j]);
            }
            arrays[i] = arr;
        }

        // Example: Print all arrays to verify the input
        System.out.println("You entered:");
        for (int[] array : arrays) {
            for (int num : array) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
