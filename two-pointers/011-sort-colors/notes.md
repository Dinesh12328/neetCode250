# Sort Colors

## Approach

Use the Dutch National Flag algorithm with three pointers.

`low` tracks where the next `0` should go, `mid` scans the array, and `high` tracks where the next `2` should go. When `nums[mid]` is `0`, swap it with `low`. When it is `1`, move forward. When it is `2`, swap it with `high`.

## Complexity

- Time: `O(n)`
- Space: `O(1)`
