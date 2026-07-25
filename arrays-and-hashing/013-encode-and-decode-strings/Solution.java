import java.util.ArrayList;
import java.util.List;

class Solution {
    public String encode(List<String> strs) {
        StringBuilder encoder = new StringBuilder();

        for (String str : strs) {
            encoder.append(str.length());
            encoder.append("#");
            encoder.append(str);
        }

        return encoder.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int i = 0;

        while (i < str.length()) {
            int j = i;

            while (str.charAt(j) != '#') {
                j++;
            }

            int length = Integer.parseInt(str.substring(i, j));
            int start = j + 1;
            int end = start + length;

            result.add(str.substring(start, end));
            i = end;
        }

        return result;
    }
}
