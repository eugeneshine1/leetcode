import java.util.Arrays;

class Solution {
    public int heightChecker(int[] heights) {
        //create a new array with the same values of the given array but sorted
        //compare each each number of the indices
        //if the number at the same indices do not match, add 1 to the counter
        //return the counter

        int[] sortedArr = new int [heights.length];
        for (int i=0; i<=heights.length-1; i++) {
            sortedArr[i]=heights[i];
        }
        Arrays.sort(sortedArr);

        int counter=0; 
        for (int i=0; i<=heights.length-1; i++) {
            if (sortedArr[i]!=heights[i]) {
                counter++;
            }
        }
        return counter;
    }
}