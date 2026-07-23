# Remove Element

## Approach

Use `k` as the position where the next valid number should be placed.

Loop through the array. If the current number is not equal to `val`, copy it to `nums[k]` and move `k` forward. At the end, `k` is the count of numbers that are not equal to `val`.

## Complexity

- Time: `O(n)`
- Space: `O(1)`
