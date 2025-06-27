package solutions;

import java.util.*;

public class SolutionTopK {
    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> freqs = new HashMap<>();
        for (int num : nums) {
            freqs.put(num, freqs.getOrDefault(num, 0) + 1);
        }

        List<Integer>[] freqBuckets = new List[nums.length + 1]; // + 1 because count starts from number 1 not 0
        for (int i = 0; i < freqBuckets.length; i++) freqBuckets[i] = new ArrayList<>();
        for (int num : freqs.keySet()) {
            freqBuckets[freqs.get(num)].add(num);
        }

        List<Integer> result = new ArrayList<>(k);
        int cnt = 0;
        for (int i = freqBuckets.length - 1; i > 0; i--) {
            result.addAll(freqBuckets[i]);
            if ((cnt += freqBuckets[i].toArray().length) >= k ) break;
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
