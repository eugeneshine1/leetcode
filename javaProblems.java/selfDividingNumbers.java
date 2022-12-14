import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        //interate through the loop and check if each digit of a number is divisble to the whole number
        //if it is divisble to the whole number and the digit is not zero add it to the list created
        //(this is checked by the other method in the same class) 
        //return the list

        List <Integer> list = new ArrayList<>();
        for (int x=left; x<=right; x++) {
            if (eachDigit(x)==true){
                list.add(x);
            }   
        }
        return list;
    }

    public boolean eachDigit(int n) {
        //take the number and get the end digit
        //check to see if the number is not zero and is divisble by the digit
        //if not return false
        //do the same thing with all digits in the number by doing a loop 
        //return true

        int num = n;
        while(num>0){
            int ans = num%10;
            if(ans == 0 || n%ans!=0){
                return false;
            }
            num = num/10;
        }
        return true;
    }
}