class Solution {
    public int searchInsert(int[] nums, int target) {
        //if the length is 1, return 0 if target equals the value or is less than the value
        // else return 1;
        // loop through the array and only look at array with length that is not 1
        // if the target number is between the number of x index and number of x-1 index, return the index x
        // if the target is equal to number at index x or x-1 return x or x-1, respectively
        // if the target is greater than the highest number, return highest index +1
        // if the target is less than the lowest number, return 0
    if (nums.length == 1) {
                if (nums[0]>target || nums[0]==target) {
                    return 0;
                } else {
                    return 1;
                }
    }
        for(int x=1; x<nums.length;x++) { 
           if(nums.length!=1) {
             if(target>nums[x-1] && target<nums[x]) {
                return x;
            } else if (nums[x-1]==target) {
                return x-1;
            } else if (nums[x]==target) {
                return x;
            } else if (target>nums[nums.length-1]) {
                return nums.length;
            } else if (target<nums[0]) {
                return 0;
            }
            }
        }
            return nums.length;
    }
}