package solutions;

import java.util.ArrayList;
import java.util.HashMap;

public class SolutionTopK {
    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> freqs = new HashMap<>();
        ArrayList<Integer> maxNums = new ArrayList<>();
        maxNums.add(-10^4);
        for (int num : nums) {
            int cnt = 0;
            try {
                cnt = freqs.get(num);
            } catch (NullPointerException e) {
                freqs.put(num, 0);
            }
            cnt += 1;
            freqs.put(num, cnt);

            for (int i = 0; i < maxNums.toArray().length; i++) {
                if (cnt >= freqs.get(maxNums.get(i)) && num != maxNums.get(i)) {
                    maxNums.add(i, num);
                    if (maxNums.size() > k) {
                        maxNums.removeLast();
                    }
                    break;
                }
            }
        }

        return maxNums.stream().mapToInt(i -> i).toArray();
    }
}
