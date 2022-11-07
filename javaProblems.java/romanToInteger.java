class Solution {
    public int romanToInt(String s) {
        // loop through each character in the string 
        // add each value of the symbol to the answer 
        // double if statements for I, X, C when they are before V, C, M respectively, minus value instead
        // return answer in int
        int ans =0; 
        for (int i=s.length-1; i>=0; i--) {
            if (s.charAt(i)=='I') {
                ans+=1;
            } else if (s.charAt(i)=='V') {
                ans+=5;
            } else if (s.charAt(i)=='X') {
                ans+=10;
            } else if (s.charAt(i)=='L') {
                ans+=50;
            } else if (s.charAt(i)=='C') {
                ans+=100;
            } else if (s.charAt(i)=='D') {
                ans+=500;
            } else if (s.charAt(i)=='M') {
                ans+=1000;
            }
        }
        return ans;
    }
}