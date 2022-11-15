import java.util.Arrays;

class Solution {
    public boolean isAnagram(String s, String t) {
        // make both strings into separate character arrays
        // sort both the arrays and set it to equal each other (.equals not ==)
        // .equals looks at value and == looks at reference 
        // return if true, else false;
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        Arrays.sort(sArr);
        Arrays.sort(tArr);
        return (Arrays.equals(sArr, tArr));
    }
}