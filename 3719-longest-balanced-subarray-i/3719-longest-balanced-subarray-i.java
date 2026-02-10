class Solution {
    public int longestBalanced(int[] nums) {
        int n = nums.length;
        int res = 0;

        int maxVal = 0;
        for (int x : nums)
            maxVal = Math.max(maxVal, x);

        short[] seen = new short[maxVal + 1];

        for (int i = 0; i < n; i++) {
            int[] A = new int[2];

            for (int j = i; j < n; j++) {
                int val = nums[j];
                if (seen[val] != i + 1) {
                    seen[val] = (short)(i + 1);
                    A[val & 1]++;
                }

                if (A[0] == A[1])
                    res = Math.max(res, j - i + 1);
            }
        }

        return res;
    }
}
