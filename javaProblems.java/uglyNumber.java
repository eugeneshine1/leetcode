class Solution {
    public boolean isUgly(int n) {
        // if the number is less than 1 return false
        // while loop through when the number is still divisble by 2,3,5
        // if it is divisble by 2, divide the number by 2
        // do this step if it is divisble by 2,3,5
        // if the number ends up being one, return true
        // else return false
        if (n<1){
            return false;
        } 
        
    while (n%3 ==0 || n%2 ==0 || n%5 ==0){
        if (n%3 ==0){
            n/=3;
        } else if(n%5 ==0) {
            n/=5;
        } else{
            n/=2;
        }
    }
        if (n==1){
            return true;
        }
        return false;
    }
}