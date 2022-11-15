class Solution {
    public void reverseString(char[] s) {
        // set variables to the first and last index of the char array
        // while loop where you switch the first char position with the last char position 
        // continue the loop by switching with the second and second to last, so on and so forth

        int firstChar = 0;
        int lastChar = s.length - 1;
        
        while(firstChar <= lastChar){
            char temp = s[firstChar];
            s[firstChar] = s[lastChar];
            s[lastChar] = temp;
            firstChar++;
            lastChar--;
        }
    }    
}