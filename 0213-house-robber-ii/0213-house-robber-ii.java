class Solution {
    public int solve(int[] arr,int s, int e){
        if (s==e) return arr[s];
        int[] dp = new int[e-s+1];
        dp[0]=arr[s];
        dp[1]=Math.max(arr[s],arr[s+1]);
        for(int i=2;i<e-s+1;i++){
            dp[i]=Math.max(dp[i-1],dp[i-2]+arr[i+s]);
        }
        return dp[e-s];
    }
    public int rob(int[] nums) {
        if(nums.length==1) return nums[0];
        if (nums.length==2) return Math.max( nums[1],nums[0]);
        int a= solve(nums,0,nums.length-2);
        int b= solve(nums,1,nums.length-1);
        return Math.max(a,b);
    }
}

