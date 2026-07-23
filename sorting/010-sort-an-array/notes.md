# Sort an Array

## Approach

Use merge sort.

Split the array into two halves until each part has one element. Then merge the sorted halves back together by comparing values from the left and right temporary arrays.

## Complexity

- Time: `O(n log n)`
- Space: `O(n)`
