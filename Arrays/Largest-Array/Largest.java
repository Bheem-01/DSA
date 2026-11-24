// Define the public class Largest (must match the filename Largest.java)
public class Largest{
    // Method that takes an integer array and returns the largest element in it
    public static int getLargest(int numbers[]){
        // Initialize largest to the smallest possible int value (-2,147,483,648) so any array element can beat it
        int largest = Integer.MIN_VALUE;

        // Loop through every index i from 0 up to numbers.length - 1
        for(int i=0; i<numbers.length; i++){
            // Check if the current element numbers[i] is greater than the largest value seen so far
            if(largest < numbers[i]){
                // Update largest to store the new maximum value found at index i
                largest = numbers[i];
            }
        }
        // Return the final largest value found after checking the entire array
        return largest;
    }
    // Entry point of the program where execution begins
    public static void main(String args[]){
        // Create and initialize an integer array with 5 sample numbers
        int numbers[] = { 10, 23, 7, 65, 17};
        // Call getLargest(numbers) and print the returned largest value to the console
        System.out.println("Largest value is: " + getLargest(numbers));
    }
}
