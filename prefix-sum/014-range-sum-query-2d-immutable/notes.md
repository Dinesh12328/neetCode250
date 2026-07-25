# Range Sum Query 2D - Immutable

## Approach

Build a 2D prefix sum matrix where `prefix[i][j]` stores the sum of all values from `(0, 0)` to `(i, j)`.

For each query, start with the full rectangle ending at `(row2, col2)`, subtract the area above it, subtract the area to the left, and add back the overlapping top-left area once.

## Complexity

- Build Time: `O(m * n)`
- Query Time: `O(1)`
- Space: `O(m * n)`
