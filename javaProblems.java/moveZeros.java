class Solution {
    public void moveZeroes(int[] nums) {
       // loop though and set each non zero number to the beginning of the array
       // do another loop to add the rest of the zeros into the array starting where the count left off from
       int count = 0;  
 
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0)
                nums[count++] = nums[i]; 
        }
      
        while (count < nums.length) {
            nums[count++] = 0;
    
        } 
    }
}
