import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> fizzBuzz(int n) {
        // create an arraylist that will contain strings
        // use for loop and interate from 1 to given number n
        // if the number is divisible by 15 or both 5 and 3, add "FizzBuzz" to list
        // if the number is divisble by 5, add "Buzz" to list
        // if the number is divisble by 3, add "Fizz" to list
        // if non of the above, add the number to the list as string
        // return list
        List <String> list = new ArrayList<>();
        for (int i=1; i<=n;i++) {
            if (i%15 ==0) {
                list.add("FizzBuzz");
            } else if (i%5 ==0) {
                list.add("Buzz");
            } else if (i%3 ==0) {
                list.add("Fizz");
            } else {
                list.add(Integer.toString(i));
            }
        }
        return list;
    }
}