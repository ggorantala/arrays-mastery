package shiftingalgorithms.deletions;

import java.util.Arrays;

/**
 * This class contains various assignments for demonstrating and creating arrays (such as
 * declaration and initialization). This class also contains print statements and two for-loops
 * that explains how to iterate through arrays
 *
 * @author ggorantala
 */
public class DeleteAtEnd {
    public static void main(String[] args) {
        // Declare an integer array of 10 elements.
        int[] A = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Say we want to delete the element at index 1
        int currentLength = A.length;

        System.out.println(Arrays.toString(A)); // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        System.out.println("current array items length: " + currentLength); // 10
        System.out.println("Array capacity: " + A.length); // 10
        // The array currently contains 0 elements

        currentLength -= 1;
        A[A.length - 1] = 0;
        System.out.println("current array items length: " + currentLength); // 9
        System.out.println(Arrays.toString(A));
    }
