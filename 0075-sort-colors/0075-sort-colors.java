class Solution {
    public void sortColors(int[] nums) {
        int cz=0, co=0;
        for (int i =0;i<nums.length;i++){
            if (nums[i]==0){
                cz++;
            }
            if(nums[i]==1){
                co++;
            }
        }
        for (int i=0; i<cz;i++ ){
            nums[i]=0;
        }
        for (int i=cz; i<co+cz;i++ ){
            nums[i]=1;
        }
        for (int i=co+cz; i<nums.length;i++ ){
            nums[i]=2;
        }
        }
    }
