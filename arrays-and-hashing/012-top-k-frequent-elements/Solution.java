import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Solution {
    @SuppressWarnings("unchecked")
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Integer>[] bucket = new List[n + 1];

        for (int key : map.keySet()) {
            int frequency = map.get(key);

            if (bucket[frequency] == null) {
                bucket[frequency] = new ArrayList<>();
            }

            bucket[frequency].add(key);
        }

        int count = 0;
        int[] res = new int[k];

        for (int pos = n; pos >= 0 && count < k; pos--) {
            if (bucket[pos] != null) {
                for (int number : bucket[pos]) {
                    if (count == k) {
                        break;
                    }
                    res[count++] = number;
                }
            }
        }

        return res;
    }
}
