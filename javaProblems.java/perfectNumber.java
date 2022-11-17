class Solution {
    public boolean checkPerfectNumber(int num) {
        // if the number is odd return false
        // loop through from 1 to half the number 
        // add each number to the sum variable if number is divisble by the index
        // set the sum and num equal to each other and if it matches return true
        // else return false
        int sum =0;
            if (num%2 !=0) {
                return false;
            }
        for (int i=1; i<=num/2;i++) {
            if (num%i ==0){
            sum+=i;
            }
        }
        if (sum==num){
            return true;
        } 
        return false;
    }
}