import org.junit.jupiter.api.Test;
import solutions.SolutionTopK;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TopKTest {
    @Test
    public void topKTest1() {
        int[] nums = new int[] {1,1,1,2,2,3};
        int k = 2;
        int[] expected = new int[] {1,2};
        assertArrayEquals(expected, SolutionTopK.topKFrequent(nums, k));
    }

    @Test
    public void topKTest2() {
        int[] nums = new int[] {1};
        int k = 1;
        int[] expected = new int[] {1};
        assertArrayEquals(expected, SolutionTopK.topKFrequent(nums, k));
    }

    @Test
    public void topKTest3() {
        int[] nums = new int[] {3, 5, 5, 3, 6, 7, 1, 3};
        int k = 1;
        int[] expected = new int[] {3};
        assertArrayEquals(expected, SolutionTopK.topKFrequent(nums, k));
    }

    @Test
    public void topKTest4() {
        int[] nums = new int[] {};
        int k = 1;
        int[] expected = new int[] {};
        assertArrayEquals(expected, SolutionTopK.topKFrequent(nums, k));
    }

    @Test
    public void topKTest5() {
        int[] nums = new int[] {1, 2};
        int k = 2;
        int[] expected = new int[] {1, 2};
        assertArrayEquals(expected, SolutionTopK.topKFrequent(nums, k));
    }

    @Test
    public void topKTest6() {
        int[] nums = new int[] {1, 2, 3, 4, 5, 6, 7, 8};
        int k = 8;
        int[] expected = new int[] {1, 2, 3, 4, 5, 6, 7, 8};
        assertArrayEquals(expected, SolutionTopK.topKFrequent(nums, k));
    }

    @Test
    public void topKTest7() {
        int[] nums = new int[] {1, 2, 3, 4, 5, 6, 7, 8};
        int k = 0;
        int[] expected = new int[] {};
        assertArrayEquals(expected, SolutionTopK.topKFrequent(nums, k));
    }
}

