// Import utility classes from java.util package (not required here, but kept available).
import java.util.*;
// Create a public class named LinearSearch.
public class LinearSearch{
    // Define a method that takes an array and a key, then returns the index where the key is found.
    public static int linear_Search(int number [], int key){
        // Start a loop that checks each element in the array from beginning to end.
        for(int i=0; i<number.length; i++){
            // Check if the current array element is equal to the key.
            if(number[i] == key){
                // If the key is found, return its index.
                return i;
            }
        // End of the for loop.
        }
        // If the loop finishes and key is not found, return -1.
        return -1;
    // End of the linear_Search method.
    }
    // Main method: program execution starts here.
    public static void main(String args[]){
        // Create an integer array with some values.
        int number[] = {10,20,30,40,50};
        // Store the value we want to search for.
        int key = 40;
        // Call linear_Search and store the returned index in the variable index.
        int index = linear_Search(number, key);

        // Check if the key was not found (index is -1).
        if(index == -1){
            // Print "Not Found" when the key is not in the array.
            System.out.println("Not Found");
        // Otherwise, the key was found.
        }else {
            // Print the index where the key was found.
            System.out.println("Key is at index: "+ index);
        }
    // End of the main method.
    }
// End of the LinearSearch class.
}