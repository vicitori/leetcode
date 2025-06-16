package solutions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class SolutionThreeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        int len = nums.length;
        List<List<Integer>> result = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                map.putIfAbsent(nums[i], i);
                map.putIfAbsent(nums[j], j);
                int rest = - nums[i] - nums[j];

                Integer index = map.get(rest);
                if (index != null && index != i && index != j) {
                    List<Integer> solution = new ArrayList<>(List.of(nums[i], nums[j], nums[index]));
                    Collections.sort(solution);
                    if (!result.contains(solution)) {
                        result.add(solution);
                    }
                }
            }
        }
        return result;
    }
}