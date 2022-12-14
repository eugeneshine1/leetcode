class Solution {
    public int firstUniqChar(String s) {
        // turn the string into a char array 
        // for each loop to check every character in the array
        // if the index of the a character matches the last index of a character, then set the index to a variable
        // break the loop so it just looks for the first unique character
        // else return -1 because there are no unique characters
        // return the index of the character
        
        int indexOfFirstUniqueChar=0;
        char charArr[]=s.toCharArray();
        
        for(char uniqueChar: charArr){
            if(s.indexOf(uniqueChar)==s.lastIndexOf(uniqueChar)){
                indexOfFirstUniqueChar=s.indexOf(uniqueChar);
                break;
            }
            else{
                indexOfFirstUniqueChar=-1;
            }
        }
        return indexOfFirstUniqueChar;
    }
}