class Solution {
    public boolean isPalindrome(int x) {
        // if x is negative return false
        // take the last digit and put it in the beginning of a new int
        // keep doing this until the first number is added to the back of the new int
        // compare if the new int is same as x 
        // return true if it is, else return false
        
        if (x<0) {
            return false;
        }
        int palin=0;
        int originalNum = x;
        while(x>0) {
            int lastDigit = x %10;
            palin = palin*10 + lastDigit;
            x=x/10;
        }
        return palin == originalNum;
    }
}