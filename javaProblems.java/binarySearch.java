class Solution {
    public int search(int[] nums, int target) {
        // binary search algorithm 
        // set and top and bottom value for size of array
        // search through the array in two halves at a time
        // loop while the bottom index is lower than the top index
        // if the value of the middle index is equal to the target, return middle index
        // if the value of the middle index is greater than the target value, set the new top to be the index of middle -1, so it will search only everything below it
        // if the value of the middle index is less than the target value, set the new bot to be the index of middle -1, so it will search only everything above it
        // if target value doesnt exist, return -1

        int top = nums.length-1;
        int bot =0;
        while (bot<=top) {
            int mid =(top+bot)/2; 
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid]>= target) {
                top = mid -1;
            } else {
                bot = mid +1 ;
            }
        }
        return -1;
    }
}