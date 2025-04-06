import java.util.*;

public class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);  // Step 1: Sort the array

        int[] dp = new int[n];     // dp[i] stores size of largest subset ending with nums[i]
        int[] prev = new int[n];   // prev[i] helps reconstruct the subset
        Arrays.fill(dp, 1);
        Arrays.fill(prev, -1);

        int maxIndex = 0;  // Index of the largest element of the max subset

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] % nums[j] == 0 && dp[i] < dp[j] + 1) {
                    dp[i] = dp[j] + 1;
                    prev[i] = j;
                }
            }

            if (dp[i] > dp[maxIndex]) {
                maxIndex = i;
            }
        }

        // Reconstruct the subset
        List<Integer> result = new ArrayList<>();
        while (maxIndex >= 0) {
            result.add(nums[maxIndex]);
            maxIndex = prev[maxIndex];
        }

        Collections.reverse(result);  // Optional: to return in increasing order
        return result;
    }
}
