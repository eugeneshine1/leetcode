class Solution {
    public int[] plusOne(int[] digits) {
        // loop through the array backwards and if the number is less than nine, add one to the value of the number and return the array 
        // if number at any time is 9, set it to zero and continue the loop
        
        // for when the value of the beginning of the array is 9
        // instantiate a new array with size 1 larger than previous array
        // make the first number equal to 1
        // return the new array (with rest of the values 0)
      for (int i = digits.length -1 ; i >= 0; i-- ){
            if (digits[i] < 9){
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }
}