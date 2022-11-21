class Solution {
    public int singleNumber(int[] nums) {
        // create hashmap with key and value to be both integer
        // key is the number in the array but no value
        // loop through and add to hashmap
        // use getOrDefault so that it puts 0 because there is no mapped value
        // add +1 at the end, this allows a counting for keys that are the same
        // another loop to look at the values(the count) of the map
        // return the key of the when the value(count) is equal to 1;
    }
}