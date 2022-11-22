import java.util.HashMap;
import java.util.Map;

class Solution {
    public int singleNumber(int[] nums) {
        // create hashmap with key and value to be both integer
        // key is the number in the array but no value
        // loop through and add to hashmap
        // use getOrDefault so that it puts 0 because there is no mapped value
        // add +1 at the end, this allows a counting for keys that are the same
        // another loop to look at the values(the count) of the map
        // return the key of the when the value(count) is equal to 1;

        Map <Integer, Integer> map  = new HashMap<>();
        for (int i=0; i<nums.length; i++) {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for (int i=0; i<nums.length; i++) {
            if (map.get(nums[i])==1) {    
                return nums[i];
            }
        }
        return 0;
    }
}