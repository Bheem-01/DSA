// Import utility classes from java.util package (kept available for common utility use).
import java.util.*;
// Declare the public class named BinarySearch, which contains the binary search logic.
public class BinarySearch{
    // Define a static method that takes a sorted int array and a key, and returns the key's index or -1 if not found.
    public static int BinarySearch(int numbers[], int key){
        // Initialize start at the first index and end at the last index of the array.
        int start = 0, end = numbers.length - 1;
        // Continue searching while the search range is valid (start index has not crossed end index).
        while (start <= end){
            // Calculate the middle index of the current search range.
            int mid = (start + end)/2;
            // Check if the middle element is equal to the key we are searching for.
            if(numbers[mid] == key){
                // Return the middle index because the key was found at this position.
                return mid;
            }
            // Check if the middle element is smaller than the key, meaning the key lies in the right half.
            if(numbers[mid] < key){
                // Move the start boundary to the right of mid to search the right half.
                start = mid + 1;
            // Otherwise, the middle element is greater than the key, so the key lies in the left half.
            }else {
                // Move the end boundary to the left of mid to search the left half.
                end = mid - 1;
            }
            // End of the while loop body; repeat until the key is found or range becomes invalid.
            }
            // Return -1 to indicate the key was not found in the array.
            return -1;
        }
        // Define the main method, which is the entry point when the program runs.
        public static void main(String args[]){
            // Create and initialize a sorted integer array to search in.
            int numbers[] = {2,4,6,8,10,12,14};
            // Store the value to search for in the array.
            int key = 10;
            // Call BinarySearch with the array and key, then print the returned index.
            System.out.println("index for key is: " + BinarySearch(numbers, key));
        }
    // End of the BinarySearch class definition.
    }
