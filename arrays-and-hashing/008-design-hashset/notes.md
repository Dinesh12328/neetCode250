# Design HashSet

## Approach

Use a boolean array where the index represents the key.

If `set[key]` is `true`, the key exists in the hash set. If it is `false`, the key does not exist. This works because the problem limits keys to the range `0` to `1000000`.

## Complexity

- Time: `O(1)` for `add`, `remove`, and `contains`
- Space: `O(1000001)`
