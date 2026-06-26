class Solution {
    public int removeDuplicates(int[] nums) {
        LinkedHashSet<Integer> set=new LinkedHashSet<>();
        for(int num:nums) {
            set.add(num);
        }
        int index=0;
        for(int num:set){
            nums[index]=num;
            index++;
        }
        return set.size();
    }
    }
