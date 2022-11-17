import java.util.Arrays;

class Solution {
    public int largestPerimeter(int[] nums) {
        // sort the array from least to greatest
        // loop from last number of array to first
        // if the last number is less than the sum of the other two int elements, return the sum of all 3 int elements
        //(as long as the 2 smaller sides together is bigger than the larger number, a triangle can be formed)
        // return 0 when it does not match the first return statement
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=n-1;i>1;i--) {
            if(nums[i]<nums[i-1]+nums[i-2]) {
                return nums[i]+nums[i-1]+nums[i-2];
            }
        }
        return 0;
    }
}