class Solution {
    public int[] countServers(int n, int[][] logs, int x, int[] queries) {
        Arrays.sort(logs, (a, b) -> a[1] - b[1]);

        int m = queries.length;
        int[][] q = new int[m][2];

        for (int i = 0; i < m; i++) {
            q[i][0] = queries[i];
            q[i][1] = i;
        }

        Arrays.sort(q, (a, b) -> a[0] - b[0]);

        int[] ans = new int[m];
        int left = 0;
        int right = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int[] query : q) {
            int time = query[0];
            int index = query[1];
            int start = time - x;

            while (right < logs.length && logs[right][1] <= time) {
                int id = logs[right][0];
                map.put(id, map.getOrDefault(id, 0) + 1);
                right++;
            }

            while (left < logs.length && logs[left][1] < start) {
                int id = logs[left][0];
                map.put(id, map.get(id) - 1);

                if (map.get(id) == 0) {
                    map.remove(id);
                }
                left++;
            }

            ans[index] = n - map.size();
        }

        return ans;
    }
}