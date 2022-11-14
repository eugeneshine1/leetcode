class Solution {
    public int missingNumber(int[] nums) {
        // add the numbers from array size to 1
        // subtract the value in the array from the sum
        // return the remaining value of sum, which should be the missing number
        
        int sum=0; 
        for (int i=1 ; i<=nums.length;i++) {
            sum += i;
        }
        int missingNum =sum ;
         for (int i=0 ; i<nums.length;i++) {
            missingNum -= nums[i];
        }
        return missingNum;
    }
}