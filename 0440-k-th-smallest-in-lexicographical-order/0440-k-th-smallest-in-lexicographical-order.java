class Solution {
    public int findKthNumber(int n, int k) {
        int current = 1;
        k--;
        
        while (k > 0) {
            int count = countSteps(n, current, current + 1);
            if (count <= k) {
                current++;
                k -= count;
            } else {
                current *= 10;
                k--;
            }
        }
        
        return current;
    }

    private int countSteps(int n, int curr, int next) {
        int steps = 0;
        while (curr <= n) {
            steps += Math.min(n + 1, next) - curr;
            curr *= 10;
            next *= 10;
        }
        return steps;
    }
}