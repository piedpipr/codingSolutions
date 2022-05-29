class Solution {
    public int[] runningSum(int[] nums) {
        int[] sums = new int[nums.length];
        sumsMethod(nums,sums,0);
        return sums;
    }
    public static void sumsMethod(int[] nums, int[] sums, int i){
        if(i==nums.length) return;
        else if(i==0) sums[i]=nums[i];
        else sums[i] = nums[i]+sums[i-1];
        sumsMethod(nums,sums,i+1);

    }
}