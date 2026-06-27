class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> mp = new HashMap<>(
            Map.of(
                'I', 1,
                'V', 5,
                'X', 10,
                'L', 50,
                'C', 100,
                'D', 500,
                'M', 1000
            )
        );
        int ans = 0;
        for(int i = s.length() - 1; i >= 0; i--){
            Integer val = mp.get(s.charAt(i));
            if(i > 0 && mp.get(s.charAt(i - 1)) < val){
                ans += val - mp.get(s.charAt(i - 1));
                i--;
            } else {
                ans += val;
            }
        }

        return ans;
    }
}