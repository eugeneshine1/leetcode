class Solution {
    public int lengthOfLastWord(String s) {
        // split the string into string array
        // count the characters of the last string
        //return the count
          
        String [] strArr = s.split(" ");
        int count=0; 
        String lastWord = strArr[strArr.length -1];
        for (int x=0; x<lastWord.length();x++) {
            count++;
        }
        return count;
    }
}