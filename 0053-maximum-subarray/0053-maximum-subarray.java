class Solution {
    public int maxSubArray(int[] nums) {
        int c=nums[0];
        int maxs =nums[0];
        for(int i=1; i<nums.length;i++){
            c=Math.max(nums[i],c+nums[i]);
            maxs =Math.max(maxs,c);
        }
        return maxs;
    }
}