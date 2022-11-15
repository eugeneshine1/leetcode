import java.util.Arrays;

public class majorityElement {
    class Solution {
        public int majorityElement(int[] nums) {
            // sort array and return that middle element 
            Arrays.sort(nums);
        return nums[(nums.length-1)/2];
        }
    }
}
