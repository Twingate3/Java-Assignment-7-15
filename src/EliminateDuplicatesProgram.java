// File Name: EliminateDuplicatesProgram.java

import java.util.ArrayList;
import java.util.Scanner;

public class EliminateDuplicatesProgram {

    // Method to eliminate duplicates from an integer array
    public static int[] eliminateDuplicates(int[] list) {
        ArrayList<Integer> uniqueList = new ArrayList<>();
        for (int num : list) {
            if (!uniqueList.contains(num)) { // Add only unique numbers
                uniqueList.add(num);
            }
        }
        // Convert ArrayList to an integer array
        int[] result = new int[uniqueList.size()];
        for (int i = 0; i < uniqueList.size(); i++) {
            result[i] = uniqueList.get(i);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter ten numbers
        System.out.println("Enter ten numbers:");
        int[] inputArray = new int[10];
        for (int i = 0; i < 10; i++) {
            inputArray[i] = scanner.nextInt();
        }

        // Invoke the eliminateDuplicates method
        int[] distinctArray = eliminateDuplicates(inputArray);

        // Display the result
        System.out.print("The distinct numbers are: ");
        for (int num : distinctArray) {
            System.out.print(num + " ");
        }
        scanner.close();
    }
}
