import java.util.Arrays;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        Arrays.sort(strs);

        StringBuilder result = new StringBuilder();
        char[] first = strs[0].toCharArray();
        char[] last = strs[strs.length - 1].toCharArray();
        int limit = Math.min(first.length, last.length);

        for (int i = 0; i < limit; i++) {
            if (first[i] != last[i]) {
                break;
            }
            result.append(first[i]);
        }

        return result.toString();
    }
}
