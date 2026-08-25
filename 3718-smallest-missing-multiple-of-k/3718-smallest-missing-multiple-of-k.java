class Solution {
    public int missingMultiple(int[] nums, int k) {
        int n=nums.length;
        HashSet<Integer> set = new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        for(int i=1;i<=n+1;i++){
            if(!set.contains(k*i))
            return (k*i);
        }
  return k;  }
}