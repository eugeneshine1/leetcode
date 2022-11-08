class Solution {
    public int removeElement(int[] nums, int val) {
        //loop through the array
        //if the number is not equal to the value to be removed, set it to the beginnging of the array
        // return the count of numbers that arent the value to be removed
        int count =0; 
        for (int x=0; x<nums.length;x++) {
            if (nums[x]!=val) {
            nums[count]=nums[x];
            count++;
            }
           
    }
         return count;
    }
}