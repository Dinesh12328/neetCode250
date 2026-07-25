# Encode and Decode Strings

## Approach

Encode each string as its length, followed by `#`, followed by the string itself.

During decoding, first read characters until `#` to get the length. Then use that length to extract the exact string, even if the string contains special characters.

## Complexity

- Time: `O(n)`
- Space: `O(n)`
