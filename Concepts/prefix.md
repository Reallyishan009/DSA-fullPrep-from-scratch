# Prefix Sum - Detailed Concept

## What is Prefix Sum?

**Prefix Sum**, also known as cumulative sum, is a technique used in computer science and programming to efficiently compute the sum of elements of an array up to a certain index.

Given an array `arr` of integers, the prefix sum array `prefixSum` is another array where each element at index `i` contains the sum of all elements in `arr` from the start up to `i`.

Formally:

\[
prefixSum[i] = \sum_{k=0}^{i} arr[k]
\]

---

## Why Use Prefix Sum?

- To quickly answer **range sum queries**, i.e., sum of elements between indices `start` and `end`.
- It allows these queries to be answered in **O(1)** time after an O(n) preprocessing.
- Useful in various problems like range queries, frequency calculations, difference arrays, and more.

---

## How to Construct a Prefix Sum Array?

Given an array:


Steps:

1. Create a `prefixSum` array of the same length.

2. Initialize the first element:


3. For each subsequent element (from `i = 1` to `n-1`):


Step-by-step calculation:

| i   | arr[i] | prefixSum[i] Calculation           | prefixSum[i] |
|-----|---------|-----------------------------------|--------------|
| 0   | 3       | prefixSum[0] = 3                  | 3            |
| 1   | 1       | prefixSum[1] = prefixSum[0] + 1  | 3 + 1 = 4    |
| 2   | 7       | prefixSum[2] = prefixSum[1] + 7  | 4 + 7 = 11   |
| 3   | 5       | prefixSum[3] = prefixSum[2] + 5  | 11 + 5 = 16  |
| 4   | 2       | prefixSum[4] = prefixSum[3] + 2  | 16 + 2 = 18  |
| 5   | 8       | prefixSum[5] = prefixSum[4] + 8  | 18 + 8 = 26  |

Resulting prefix sum array:


---

## Querying Range Sum Using Prefix Sum

To find the sum of values between indices `start` and `end` (`0`-based indexing):

\[
sum(start, end) = prefixSum[end] - prefixSum[start - 1] \quad \text{(if } start > 0\text{)}
\]

If `start = 0`:

\[
sum(0, end) = prefixSum[end]
\]

**Example:**

Calculate the sum from index 1 to 3 in the original `arr`.


The sum of elements at indices 1, 2, and 3 is: 1 + 7 + 5 = 13

---

## Python Code Implementation
    def prefix_sum(arr):
        prefixSum = * len(arr)
        prefixSum = arr
        for i in range(1, len(arr)):
        prefixSum[i] = prefixSum[i-1] + arr[i]
        return prefixSum

    def range_sum(prefixSum, start, end):
        if start == 0:
        return prefixSum[end]
        else:
        return prefixSum[end] - prefixSum[start - 1]


Example usage

arr = [3,1,7,5,2,8]
prefixSum = prefix_sum(arr)
print("Prefix Sum Array:", prefixSum) # Output: [3, 4, 11,int("Sum from index 1 to 3:", range_sum(prefixSum, 1, 3)) # Output: 13
print("Sum from index 0 to 5:", range_sum(prefixSum, 0, 5)) # Output: 26

---

## Complexity

- **Preprocessing time:** O(n), where n is the size of the input array.
- **Space complexity:** O(n) for storing the prefix sum.
- **Query time:** O(1) for each range sum query after preprocessing.

---

## Applications of Prefix Sum

- Efficient range sum queries.
- Counting occurrences and frequency calculations.
- Solving problems involving subarray sums.
- Used in difference arrays for range update efficiently.

---

## Summary

| Concept       | Description                                      |
|---------------|------------------------------------------------|
| Prefix Sum    | Cumulative sum up to a certain index in an array. |
| Construction  | Sum up values from start to current index i.      |
| Range Queries | O(1) sum queries possible using prefix sums.      |
| Complexity    | O(n) preprocessing, O(1) query time.               |

---

## Further Reading and Resources

- [Prefix Sum Technique - Take U Forward](https://takeuforward.org/data-structure/prefix-sum-technique/)
- [Prefix Sum Array - GeeksforGeeks](https://www.geeksforgeeks.org/dsa/prefix-sum-array-implementation-applications-competitive-programming/)
- [Prefix Sums Introduction - USACO Guide](https://usaco.guide/silver/prefix-sums)
- [Prefix Sum Wikipedia](https://en.wikipedia.org/wiki/Prefix_sum)

---

*This concludes the detailed explanation of Prefix Sum technique.*  
