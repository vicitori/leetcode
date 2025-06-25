package solutions;

import java.util.ArrayList;

public class SolutionStock {
    public static int maxProfit(int[] prices) {
        int[] maxs = new int[prices.length];
        if (prices.length != 0) {
            maxs[prices.length -1 ] = prices[prices.length -1 ];
        }
        for (int i = prices.length - 1; i > 0; i--) {

            if (prices[i - 1] > maxs[i]) {
                maxs[i - 1] = prices[i - 1];
            } else {
                maxs[i - 1] = maxs[i];
            }
        }
        int max = 0;
        for (int i = 0; i < prices.length; i++) {
            maxs[i] -= prices[i];
            if (maxs[i] > max) max = maxs[i];
        }
        return max;
    }
}
