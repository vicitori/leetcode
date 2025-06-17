import org.junit.jupiter.api.Test;
import solutions.SolutionMerge.*;
import solutions.SolutionThreeSum;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MergeTest {
    public static ListNode makeList(int[] arr) {
        ListNode list = new ListNode();
        for (int val: arr) {
            list = new ListNode(val, list);
        }
    }

    @Before
    @Test
    public void mergeTest1() {
        exp
        assertEquals(expected1, SolutionThreeSum.threeSum(nums1));
    }
}
