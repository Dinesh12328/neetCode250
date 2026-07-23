# Longest Common Prefix

## Approach

Sort the array of strings first. After sorting, the smallest and largest strings lexicographically will have the maximum possible difference.

So only compare the first and last strings. Keep adding matching characters until the characters are different or one string ends.

## Complexity

- Time: `O(n log n * m)`
- Space: `O(m)`
