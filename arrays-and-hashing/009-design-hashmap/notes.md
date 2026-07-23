# Design HashMap

## Approach

Use an integer array where the index represents the key.

Initialize every value to `-1`, which means the key does not exist. To insert or update a key, store the value at `map[key]`. To remove a key, set `map[key]` back to `-1`.

This works because the problem limits keys to the range `0` to `1000000`, and values are non-negative.

## Complexity

- Time: `O(1)` for `put`, `get`, and `remove`
- Space: `O(1000001)`
