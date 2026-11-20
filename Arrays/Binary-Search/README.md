# Binary Search in Java

## 📌 Overview

Binary Search is an efficient searching algorithm that follows the **Divide and Conquer** approach.

It repeatedly divides a sorted array into two halves and compares the middle element with the target key.

If the middle element matches the target, its index is returned. Otherwise, the algorithm eliminates one half of the array and continues searching in the remaining half.

**Important:** Binary Search requires a sorted array.

## 🎯 Problem Statement

Given a sorted array of integers and a target element (key), find the index of the target element.

- If the target exists, return its index.
- If the target does not exist, return `-1`.

### Example

**Input:**
```java
numbers[] = {2, 4, 6, 8, 10, 12, 14}
key = 10
```

**Output:**
```text
index for key is: 4
```

**Explanation:**

The algorithm checks the middle element of the array.

If the middle element is smaller than the target, it searches the right half.

If the middle element is greater than the target, it searches the left half.

This process continues until the target is found or the search range becomes empty.

## 🧠 Approach and Logic

Binary Search follows the Divide and Conquer approach.

### Steps

1. Initialize `start = 0` and `end = numbers.length - 1`.
2. Calculate the middle index using `mid = start + (end - start) / 2`.
3. Compare `numbers[mid]` with the target key.
4. If `numbers[mid] == key`, return `mid`.
5. If `numbers[mid] < key`, search the right half by updating `start = mid + 1`.
6. Otherwise, search the left half by updating `end = mid - 1`.
7. Repeat while `start <= end`.
8. If the target is not found, return `-1`.

### Pseudocode

```text
START

1. Initialize start = 0
2. Initialize end = array length - 1

3. WHILE start <= end:

      a. Calculate mid = (start + end) / 2

      b. IF array[mid] == key:
            RETURN mid

      c. ELSE IF array[mid] < key:
            start = mid + 1

      d. ELSE:
            end = mid - 1

4. RETURN -1

END
```

## 🔄 Algorithm Dry Run

**Array:** `[2, 4, 6, 8, 10, 12, 14]`

**Target:** `10`

| Iteration | Start | End | Mid | Middle Element | Decision |
|-----------|-------|-----|-----|----------------|----------|
| 1 | 0 | 6 | 3 | 8 | Search right |
| 2 | 4 | 6 | 5 | 12 | Search left |
| 3 | 4 | 4 | 4 | 10 | Found! |

**Final Result:** `4`

The target element is found at index 4.

## 💻 Java Implementation

```java
import java.util.*;

public class BinarySearch {

    public static int BinarySearch(int numbers[], int key) {

        int start = 0;
        int end = numbers.length - 1;

        while(start <= end) {

            int mid = start + (end - start) / 2;

            if(numbers[mid] == key) {
                return mid;
            }

            if(numbers[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String args[]) {

        int numbers[] = {2, 4, 6, 8, 10, 12, 14};
        int key = 10;

        System.out.println("index for key is: " + BinarySearch(numbers, key));
    }
}
```

## ⏱️ Time Complexity Analysis

Let `n` represent the number of elements in the array.

Binary Search reduces the search space by half in every iteration.

| Case | Complexity | Explanation |
|------|------------|-------------|
| Best Case | O(1) | Target is found at the middle in the first iteration. |
| Average Case | O(log n) | The search space is repeatedly divided into halves. |
| Worst Case | O(log n) | The algorithm continues dividing until the target is found or the search range becomes empty. |

### Best Case: O(1)

If the target element is already at the middle index, it is found in the first comparison.

### Average Case: O(log n)

The algorithm eliminates half of the remaining elements in each iteration.

Therefore, the number of comparisons grows logarithmically with the input size.

### Worst Case: O(log n)

The algorithm continues dividing the search range until the target is found or no elements remain.

Therefore, the worst-case time complexity is O(log n).

## 💾 Space Complexity Analysis

**Auxiliary Space: O(1)**

This implementation uses an iterative approach and requires only a fixed number of additional variables:

- `start`
- `end`
- `mid`
- `key`

No additional array or data structure is created.

Therefore, auxiliary space complexity is O(1).

## 📊 Complexity Summary

| Complexity Type | Value |
|-----------------|-------|
| Best Time | O(1) |
| Average Time | O(log n) |
| Worst Time | O(log n) |
| Auxiliary Space | O(1) |

## ⚙️ How to Run This Program

### Prerequisites

1. Install Java Development Kit (JDK).
2. Install Visual Studio Code.
3. Install the Extension Pack for Java in VS Code.

### Step 1: Clone the Repository

```bash
git clone YOUR_REPOSITORY_URL
```

### Step 2: Navigate to the Project Folder

```bash
cd Binary-Search
```

### Step 3: Compile the Java Program

```bash
javac BinarySearch.java
```

### Step 4: Execute the Program

```bash
java BinarySearch
```

### Expected Output

```text
index for key is: 4
```

**Note:** The Java filename must be `BinarySearch.java` because the public class is named `BinarySearch`.

## 🔍 Linear Search vs Binary Search

| Feature | Linear Search | Binary Search |
|---------|---------------|---------------|
| Approach | Sequential Search | Divide and Conquer |
| Sorted Array Required | No | Yes |
| Best Case | O(1) | O(1) |
| Average Case | O(n) | O(log n) |
| Worst Case | O(n) | O(log n) |
| Auxiliary Space | O(1) | O(1) |

## ✅ Key Takeaways

- Binary Search follows the Divide and Conquer approach.
- It works only when the array is sorted and the comparison logic matches the sorting order.
- It uses three important variables: `start`, `end`, and `mid`.
- It eliminates half of the search space in every iteration.
- Best-case time complexity is O(1).
- Worst-case time complexity is O(log n).
- Auxiliary space complexity is O(1).

## 🚀 Learning Outcome

Through this problem, I learned how to implement Binary Search using Java, apply the Divide and Conquer approach, reduce the search space, perform dry runs, and analyze time and space complexity.

---

**Topic:** Data Structures and Algorithms (DSA)  
**Language:** Java  
**Algorithm:** Binary Search