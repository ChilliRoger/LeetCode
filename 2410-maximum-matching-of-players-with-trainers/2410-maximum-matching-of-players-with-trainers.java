class Solution {
    public int matchPlayersAndTrainers(int[] player, int[] trainers) {
        Arrays.sort(player);
        Arrays.sort(trainers);
        int i = 0, j = 0, count = 0;
        while (i < player.length && j < trainers.length) {
            if (player[i] <= trainers[j]) {
                i++; count++;
            }
            j++;
        }
        return count;
    }
}
