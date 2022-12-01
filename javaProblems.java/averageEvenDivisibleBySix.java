class Solution {
    public int averageValue(int[] nums) {
        //interate through the array and see if the number is divisible by 6 because it must be divisble by 3 and even number (by 2);
        //if it is divisible by 6, then add 1 to the counter and add the number to the sum
        //return the the sum of all numbers divisble by the count, which will give you the average value of even numbers that are divisible by 3
        int count=0;
        int sum=0;
        for(int x=0; x<nums.length;x++) {
            if (nums[x]%6 ==0) {
                count++;
                sum+=nums[x];
            }
        }
        if (count==0) {
            return 0;
        }
        return sum/count;
    }
}