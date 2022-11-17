class Solution {
    public boolean detectCapitalUse(String word) {
        //loop through the string and if a char is uppercase, add 1 to the counter
        //if there is no uppercase (count is 0), then return true
        //if the count is 1 and the uppercase is in the beginning, return true
        //return word length equals to count in case that all are capital letters
        int count=0;
        for (int i=0; i<word.length();i++) {
            if(Character.isUpperCase(word.charAt(i))) {
                count++;
            }
        }
        if (count==0) {
            return true;
        }
        if (count==1 && Character.isUpperCase(word.charAt(0))) {
            return true;
        }
        return count==word.length();
    }
}