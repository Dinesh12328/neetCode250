# Top K Frequent Elements

## Approach

Count the frequency of every number using a `HashMap`.

Then use bucket sort. The index of the bucket represents a frequency, and each bucket stores the numbers with that frequency. Start from the highest frequency bucket and collect numbers until `k` elements are found.

## Complexity

- Time: `O(n)`
- Space: `O(n)`
