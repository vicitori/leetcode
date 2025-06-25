import org.junit.jupiter.api.Test;
import solutions.SolutionStock;
import solutions.SolutionThreeSum;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StockTest {
    @Test
    public void stockTest1() {
        int[] input = new int[] {7, 1, 5, 3, 6, 4};
        assertEquals(5, SolutionStock.maxProfit(input));
    }

    @Test
    public void stockTest2() {
        int[] input = new int[] {7, 6, 4, 3, 1};
        assertEquals(0, SolutionStock.maxProfit(input));
    }

    @Test
    public void stockTest3() {
        int[] input = new int[] {1, 2};
        assertEquals(1, SolutionStock.maxProfit(input));
    }

    @Test
    public void stockTest4() {
        int[] input = new int[] {};
        assertEquals(0, SolutionStock.maxProfit(input));
    }

    @Test
    public void stockTest5() {
        int[] input = new int[] {5, 5, 5, 5, 5};
        assertEquals(0, SolutionStock.maxProfit(input));
    }

    @Test
    public void stockTest6() {
        int[] input = new int[] {5};
        assertEquals(0, SolutionStock.maxProfit(input));
    }

    @Test
    public void stockTest7() {
        int[] input = new int[] {1, 2, 1, 2, 1, 3};
        assertEquals(2, SolutionStock.maxProfit(input));
    }
}
