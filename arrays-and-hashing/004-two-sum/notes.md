# Two Sum

## Approach

Use a `HashMap` to store each number and its index.

For every number, calculate the needed complement: `target - nums[i]`. If the complement already exists in the map, return its index and the current index. Otherwise, store the current number with its index.

## Complexity

- Time: `O(n)`
- Space: `O(n)`
