class Solution {
    public int[] twoSum(int[] nums, int target) {
        // double loop through the array and find each combination
        //if the combination adds up to target return x,y indexes 
        // indexes cannot be the same int [] ans = new int [2];
        int [] ans = new int [2];
        for(int i=0; i<nums.length; i++) {
            for(int idx =0; idx<nums.length; idx++) {
                if(nums[i] + nums [idx] == target && i!=idx) {
                    ans[0]=i;
                    ans[1]=idx;
                }
            }
        }
        return ans;
    }
}