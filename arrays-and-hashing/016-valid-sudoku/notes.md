# Valid Sudoku

## Approach

Use three arrays of `HashSet`s to track values seen in each row, column, and 3x3 box.

For each filled cell, check whether the value already exists in its row, column, or box. If it does, the board is invalid. Otherwise, add it to all three sets.

The box index is calculated using `(row / 3) * 3 + (col / 3)`.

## Complexity

- Time: `O(1)`, because the board is always 9x9
- Space: `O(1)`, because the storage is bounded by 9 rows, 9 columns, and 9 boxes
