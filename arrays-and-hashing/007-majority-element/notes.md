# Majority Element

## Approach

Use a `HashMap` to count how many times each number appears.

The majority element appears more than `n / 2` times, so after counting all numbers, loop through the map and return the number whose count is greater than `n / 2`.

## Complexity

- Time: `O(n)`
- Space: `O(n)`
