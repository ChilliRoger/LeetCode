class Solution {
    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        List<String> l=new ArrayList<>();
        if(words.length==1){
            l.add(words[0]);
         return l;}
          l.add(words[0]);
        for(int i=0;i<words.length-1;i++){
            
            if(groups[i]!=groups[i+1]){
                l.add(words[i+1]);
                
            }
        }
        return l;
    }
}