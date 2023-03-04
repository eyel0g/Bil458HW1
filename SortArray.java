import java.util.Arrays;
import java.util.Scanner;

public class SortArray {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user to enter the length of the array
        System.out.print("Enter the length of the array: ");
        int length = scanner.nextInt();
        
        // Create an array of integers with the specified length
        int[] myArray = new int[length];
        
        // Ask the user to enter the elements of the array
        for (int i = 0; i < length; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            myArray[i] = scanner.nextInt();
        }
        
        // Use the built-in Arrays.sort() method to sort the array in ascending order
        Arrays.sort(myArray);
        
        // Print the sorted array
        System.out.println("Sorted array: " + Arrays.toString(myArray));
    }
}
