// This program reverses an array by swapping elements from both ends.
// Declare a public class named Reverse.
public class Reverse{
    // Define a method that takes an integer array and reverses it in place.
    public static void Reverse(int numbers[]){
        // Set 'first' to the starting index (left side of the array).
        int first = 0;
        // Set 'last' to the ending index (right side of the array).
        int last = numbers.length-1;

        // Continue swapping while the left index is before the right index.
        while(first < last){
            // Store the value at the right index in a temporary variable so it is not lost.
            int temp = numbers[last];
            // Copy the left-side value into the right-side position.
            numbers[last] = numbers[first];
            // Put the saved right-side value into the left-side position, completing the swap.
            numbers[first] = temp;
            // Move the left index one step to the right.
            first ++;
            // Move the right index one step to the left.
            last --;
        // End of the while loop; repeat until the pointers meet or cross.
        }
    // End of the Reverse method.
    }
    // Main method: program execution starts here.
    public static void main(String args[]){
        // Create an integer array with sample values.
        int numbers[] = {2,4,6,8,10};
        // Call the Reverse method to reverse the array in place.
        Reverse(numbers);
        
        // Loop through the reversed array from first index to last index.
        for(int i=0; i<numbers.length; i++){
            // Print the current element followed by a space.
            System.out.print(numbers [i] + " ");
        }
        // Print a new line after all elements are displayed.
        System.out.println();
    // End of the main method.
    }
// End of the Reverse class.
}
