
class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        int n = nums1.length;
        long[] diff = new long[n];

        long max = 0;
        long total = 0;

        for (int i = 0; i < n; i++) {
            diff[i] = Math.abs(nums1[i] - nums2[i]);
            max = Math.max(max, diff[i]);
            total += diff[i];
        }

        long k = (long) k1 + k2;

        if (total <= k) {
            return 0;
        }

        long left = 0;
        long right = max;

        while (left < right) {
            long mid = left + (right - left) / 2;
            long need = 0;

            for (int i = 0; i < n; i++) {
                if (diff[i] > mid) {
                    need += diff[i] - mid;
                }
            }

            if (need > k) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        long used = 0;

        for (int i = 0; i < n; i++) {
            if (diff[i] > left) {
                used += diff[i] - left;
                diff[i] = left;
            }
        }

        long remaining = k - used;

        for (int i = 0; i < n && remaining > 0; i++) {
            if (diff[i] == left && left > 0) {
                diff[i]--;
                remaining--;
            }
        }

        long ans = 0;

        for (int i = 0; i < n; i++) {
            ans += diff[i] * diff[i];
        }

        return ans;
    }
}