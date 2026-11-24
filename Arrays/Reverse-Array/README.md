# Reverse an Array in Java

## 📌 Problem Statement

Given an array of integers, our task is to **reverse the array** without creating another array.

Reversing an array means changing the order of its elements so that the last element becomes the first, the second-last becomes the second, and so on.

### Example

**Input:**
```java
numbers[] = {2, 4, 6, 8, 10};
```

**Output:**
```text
10 8 6 4 2
```

## 🧠 Logic Behind the Solution

To solve this problem, we use the **Two-Pointer Approach**.

The idea is very simple:

Instead of creating a new array, we can reverse the original array by swapping elements from both ends.

### Steps to Solve

1. Create two variables:
   - `first = 0` → Points to the first element.
   - `last = numbers.length - 1` → Points to the last element.

2. Swap the elements at the `first` and `last` positions using a temporary variable.

3. After swapping:
   - Increase `first` by 1 to move towards the right.
   - Decrease `last` by 1 to move towards the left.

4. Repeat this process while `first < last`.

5. When both pointers meet or cross each other, the array is completely reversed.

## 💻 Java Code

```java
public class Reverse {

    public static void Reverse(int numbers[]) {

        int first = 0;
        int last = numbers.length - 1;

        while (first < last) {

            // Store the last element temporarily
            int temp = numbers[last];

            // Move the first element to the last position
            numbers[last] = numbers[first];

            // Move the stored element to the first position
            numbers[first] = temp;

            // Move both pointers towards the center
            first++;
            last--;
        }
    }

    public static void main(String args[]) {

        int numbers[] = {2, 4, 6, 8, 10};

        Reverse(numbers);

        // Print the reversed array
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println();
    }
}
```

## 🔍 Dry Run (Step-by-Step Execution)

**Original Array:**

```text
[2, 4, 6, 8, 10]
```

| Step | First Pointer | Last Pointer | Array After Swapping |
|---|---|---|---|
| Initial | 0 | 4 | [2, 4, 6, 8, 10] |
| 1 | 0 | 4 | [10, 4, 6, 8, 2] |
| 2 | 1 | 3 | [10, 8, 6, 4, 2] |
| Stop | 2 | 2 | [10, 8, 6, 4, 2] |

### Understanding the Dry Run

**Step 1:**

- The first pointer is at index `0`, containing `2`.
- The last pointer is at index `4`, containing `10`.
- Swap `2` and `10`.

Array becomes:

```text
[10, 4, 6, 8, 2]
```

**Step 2:**

- Move `first` to index `1`, containing `4`.
- Move `last` to index `3`, containing `8`.
- Swap `4` and `8`.

Array becomes:

```text
[10, 8, 6, 4, 2]
```

**Step 3:**

Both pointers now point to index `2`.

Since the condition `first < last` is false, the loop stops.

Our array has been successfully reversed!

## ⏱️ Time and Space Complexity

### Time Complexity: O(n)

We use a `while` loop to swap elements from both ends of the array.

Since two elements are handled in every iteration, the loop runs approximately `n/2` times.

In Big O notation, we ignore constant factors.

Therefore:

**Time Complexity = O(n)**

### Space Complexity: O(1)

We are not creating another array.

We only use three extra variables:

- `first`
- `last`
- `temp`

The number of extra variables remains constant, regardless of the size of the array.

Therefore:

**Auxiliary Space Complexity = O(1)**

## 🎯 What I Learned

Through this problem, I learned:

1. **Two-Pointer Technique:** Using two pointers to work with elements from opposite ends of an array.
2. **Swapping Elements:** Using a temporary variable to exchange two values without losing data.
3. **In-Place Reversal:** Modifying the original array without creating another array.
4. **While Loop:** Repeating operations until the required condition becomes false.
5. **Time and Space Complexity:** Understanding how efficiently an algorithm runs and how much extra memory it uses.

## ▶️ How to Run the Code

**Step 1:** Save the Java file as `Reverse.java`.

**Step 2:** Open the terminal in VS Code.

**Step 3:** Compile the program.

```bash
javac Reverse.java
```

**Step 4:** Run the program.

```bash
java Reverse
```

### Expected Output

```text
10 8 6 4 2
```

## 💡 Key Takeaway

Whenever we need to reverse an array, we do not necessarily need to create a new array.

We can use two pointers, swap the elements at both ends, and move the pointers towards the center until the array is reversed.

This approach is simple, memory-efficient, and useful in many other DSA problems.

---

**DSA Learning Journey | Java | Arrays | Two Pointers**

*Documenting my DSA journey, one problem at a time.* 🚀