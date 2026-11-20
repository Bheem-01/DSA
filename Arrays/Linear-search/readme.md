# Linear Search in Java

## 📌 Overview

Linear Search is one of the simplest searching algorithms in Data Structures and Algorithms (DSA).

It works by checking each element of an array sequentially until the required element (key) is found or the entire array has been traversed.

It does not require the array to be sorted.

## 🎯 Problem Statement

Given an array of integers and a target element (key), find the index of the target element.

- If the target element exists, return its index.
- If the target element does not exist, return `-1`.

### Example

**Input:**
```java
number[] = {10, 20, 30, 40, 50}
key = 40
```

**Output:**
```text
Key is at index: 3
```

**Explanation:**

The algorithm compares the key with every array element, starting from index 0.

When it reaches index 3, it finds that `number[3] == 40` and returns index 3.

## 🧠 Approach and Logic

The basic idea is to traverse the array from left to right and compare each element with the target.

### Steps

1. Start from the first element of the array (index 0).
2. Traverse the array using a `for` loop.
3. Compare the current element with the target key.
4. If both are equal, immediately return the current index.
5. If the loop completes without finding the key, return `-1`.

### Pseudocode

```text
START

1. Take an array and a target key.
2. Repeat for every element in the array:
      a. Compare the current element with key.
      b. If equal, return the current index.
3. If the element is not found, return -1.

END
```

## 🔄 Algorithm Dry Run

**Array:** `[10, 20, 30, 40, 50]`

**Target:** `40`

| Iteration | Index | Current Element | Comparison | Result |
|-----------|-------|-----------------|------------|--------|
| 1 | 0 | 10 | 10 == 40 | Not Found |
| 2 | 1 | 20 | 20 == 40 | Not Found |
| 3 | 2 | 30 | 30 == 40 | Not Found |
| 4 | 3 | 40 | 40 == 40 | Found |

**Final Result:** `3`

The function returns immediately after finding the target.

## 💻 Java Implementation

```java
import java.util.*;

public class LinearSearch {

    public static int linear_Search(int number[], int key) {

        for(int i = 0; i < number.length; i++) {

            if(number[i] == key) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String args[]) {

        int number[] = {10, 20, 30, 40, 50};
        int key = 40;

        int index = linear_Search(number, key);

        if(index == -1) {
            System.out.println("Not Found");
        } else {
            System.out.println("Key is at index: " + index);
        }
    }
}
```

## ⏱️ Time Complexity Analysis

Let `n` represent the number of elements in the array.

| Case | Complexity | Explanation |
|------|------------|-------------|
| Best Case | O(1) | Target is found at the first index. |
| Average Case | O(n) | Approximately half of the elements are checked. |
| Worst Case | O(n) | Target is at the last position or is not present. |

### Best Case: O(1)

The target is found in the first comparison. Only one operation is required.

### Average Case: O(n)

On average, approximately `(n+1)/2` comparisons are needed when the target is equally likely to be at any position.

Ignoring constants, the complexity is O(n).

### Worst Case: O(n)

The algorithm may need to traverse the entire array when the target is at the last position or does not exist.

Therefore, the worst-case complexity is O(n).

## 💾 Space Complexity Analysis

**Auxiliary Space: O(1)**

The algorithm uses only a constant amount of additional memory.

It uses:
- One loop variable (`i`).
- One target variable (`key`).
- One return value.

No additional array or data structure is created.

Therefore, the auxiliary space complexity is O(1).

## 📊 Complexity Summary

| Complexity Type | Value |
|-----------------|-------|
| Best Time | O(1) |
| Average Time | O(n) |
| Worst Time | O(n) |
| Auxiliary Space | O(1) |

## ⚙️ How to Run This Program

### Prerequisites

1. Install Java Development Kit (JDK).
2. Install a code editor such as VS Code or IntelliJ IDEA.
3. Configure Java in your system.

### Step 1: Clone the Repository

```bash
git clone YOUR_REPOSITORY_URL
```

### Step 2: Navigate to the Project Folder

```bash
cd Linear-Search
```

### Step 3: Compile the Java Program

```bash
javac LinearSearch.java
```

### Step 4: Execute the Program

```bash
java LinearSearch
```

### Expected Output

```text
Key is at index: 3
```

**Note:** The Java filename must be `LinearSearch.java` because the public class is named `LinearSearch`.

## ✅ Key Takeaways

- Linear Search checks elements sequentially.
- It works with both sorted and unsorted arrays.
- It returns the index when the target is found.
- It returns -1 when the target does not exist.
- Best-case time complexity is O(1).
- Worst-case time complexity is O(n).
- Auxiliary space complexity is O(1).

## 🚀 Learning Outcome

Through this problem, I learned how to traverse an array, compare elements, use conditional statements, return values from methods, perform dry runs, and analyze time and space complexity.

---

**Topic:** Data Structures and Algorithms (DSA)  
**Language:** Java  
**Algorithm:** Linear Search