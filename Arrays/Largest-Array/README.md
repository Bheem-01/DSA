1. Understanding the problem
Problem: Given an integer array, find the largest element present in that array.

2. How to think before writing the code
Whenever you encounter a DSA problem, do not immediately start writing code. First, think about how you would solve the problem manually.

Suppose someone gives you five numbers:
10

23

7

65

17

Ask yourself the following questions:
Question	Your thought process
What do I need to find?	The largest number.
Is the array sorted?	No.
Can the largest number be anywhere?	Yes.
Do I need to visit every element?	Yes.
How can I visit every element?	Using a loop.
How will I remember the largest number?	Using a variable called largest.
When should I update that variable?	Whenever the current element is greater than largest.
What should I return?	The final value of largest.

Once you have answered these questions, you have practically solved the problem. You only need to convert your thoughts into Java code.

3. How to identify the DSA pattern
DSA patternLinear Traversal
Also known as Single-Pass Traversal, with a running maximum.

Keywords to identify this pattern:
- Find the largest or smallest element.
- Count the occurrence of an element.
- Find the sum or average of elements.
- Count even and odd numbers.
- Find the first or last occurrence.

Whenever a problem requires you to examine elements one by one while maintaining some information in a variable, think about linear traversal first.

Even if the largest element is present at the first index, we still need to check the remaining elements because we do not know whether a larger element exists.

Therefore, all three cases have linear time complexity.

--------------------------------------------------------
# Finding the Largest Element in an Array in Java

## Problem Statement

Given an integer array, find and return the largest element present in the array without sorting it.

## Example

**Input:**

`numbers = [10, 23, 7, 65, 17]`

**Output:**

`Largest value is: 65`

## Thought Process

Before writing the code, I tried to understand how I would solve the problem manually.

- The largest element can be present anywhere in the array.
- Therefore, I need to visit every element using a loop.
- I need a variable called `largest` to remember the maximum value found so far.
- If the current element is greater than `largest`, I update the variable.
- After checking all the elements, I return the final value of `largest`.

## DSA Pattern Used

**Linear Traversal (Single-Pass Approach)**

In this approach, we traverse the entire array once and maintain a variable to store the largest element encountered so far.

## Logic and Approach

1. Initialize a variable `largest` with `Integer.MIN_VALUE`.
2. Traverse the array using a `for` loop.
3. Compare each element with the current value of `largest`.
4. If the current element is greater, update `largest`.
5. Continue until all elements have been checked.
6. Return the final value of `largest`.

## Why Integer.MIN_VALUE?

`Integer.MIN_VALUE` represents the smallest possible integer value in Java, which is -2,147,483,648.

Initializing `largest` with this value allows the algorithm to work correctly even when the array contains only negative numbers.

Initializing it with zero could produce an incorrect result for an array containing only negative elements.

## Dry Run

| Index | Current Element | Largest So Far |
|---|---:|---:|
| 0 | 10 | 10 |
| 1 | 23 | 23 |
| 2 | 7 | 23 |
| 3 | 65 | 65 |
| 4 | 17 | 65 |

**Final Result: 65**

## Time and Space Complexity

| Complexity | Value |
|---|---|
| Best Case | O(n) |
| Average Case | O(n) |
| Worst Case | O(n) |
| Auxiliary Space | O(1) |

**Time Complexity — O(n)**

The algorithm visits every element of the array exactly once. If the array contains n elements, the loop performs n iterations. Therefore, the time complexity is linear.

**Auxiliary Space Complexity — O(1)**

The algorithm uses only a constant number of additional variables, regardless of the size of the array.

## Edge Cases

- Array containing only negative numbers.
- Array containing a single element.
- Array containing duplicate elements.
- Array containing identical elements.

The current implementation assumes that the array is non-empty. Empty arrays require separate validation.

## How to Run

Compile the Java program:

`javac Largest.java`

Execute the program:

`java Largest`

## Key Learnings

- Traversing an array using a loop.
- Maintaining and updating a maximum value.
- Understanding Integer.MIN_VALUE.
- Handling negative numbers.
- Identifying the linear traversal pattern.
- Calculating time and space complexity.

## My DSA Learning Journey

This program is a part of my Data Structures and Algorithms learning journey using Java. My objective is not just to write working code but also to understand the thought process, identify problem-solving patterns, and analyze the efficiency of each solution.