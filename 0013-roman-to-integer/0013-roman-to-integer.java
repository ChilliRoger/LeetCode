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
            if(i > 0 && mp.get(s.charAt(i - 1)) < mp.get(s.charAt(i))){
                ans += mp.get(s.charAt(i)) - mp.get(s.charAt(i - 1));
                i--;
            } else {
                ans += mp.get(s.charAt(i));
            }
        }

        return ans;
    }
}