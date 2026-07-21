\# Valid Anagram



\## Approach



If the lengths of both strings are different, they cannot be anagrams.



Use an integer array of size `26` to count characters. Add counts for characters in `s`, then subtract counts for characters in `t`. If all counts become `0`, both strings are anagrams.



\## Complexity



\- Time: `O(n)`

\- Space: `O(1)`

