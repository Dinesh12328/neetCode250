# Product of Array Except Self

## Approach

Use the answer array to store prefix products first.

Then scan from right to left with a `rightProduct` variable. For each index, multiply the prefix product already stored in the answer by the product of all numbers to its right.

This avoids division and does not need separate left and right arrays.

## Complexity

- Time: `O(n)`
- Space: `O(1)` extra space, excluding the output array
