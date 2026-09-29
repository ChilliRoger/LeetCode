class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int n = nums1.length , m = nums2.length;
        int[] merged = new int[n + m];
        System.arraycopy(nums1, 0 , merged , 0 , n);
        System.arraycopy(nums2, 0 , merged , n , m);

        Arrays.sort(merged);
        int len = merged.length;
        if(len % 2 != 0){
            return (double)merged[ len / 2];
        }
        else{
            int x = merged[(len - 1) / 2];
            int y = merged[len / 2];
            return (double)(x + y) / 2.0;

        }
        

    }
}