class Solution {
    public int minimumPushes(String word) {

        //Calculate frequency of each character
        int[] freq = new int[26];

        for(char ch: word.toCharArray())
        {
            freq[ch - 'a']++;
        }

        Arrays.sort(freq);

        int ans=0;
        for(int i=25,pos=0; i>=0 && freq[i] > 0; i--,pos++)
        {
            ans += freq[i]*(pos/8 + 1);
        }
        return ans;

        
    }
}