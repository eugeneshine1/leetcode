class Solution {
    public void moveZeroes(int[] nums) {
        // use a bubble sort and make all zeros to right side
        for (int i = 0; i<nums.length; i++) {
            for (int idx =0; idx<nums.length; idx ++) {
                if (nums[idx]==0) {
                    int temp = nums[idx];
                    nums[idx]= nums[i];
                    nums[i] = temp;
                }
            }
        }
    }
}
