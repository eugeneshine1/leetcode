class Solution {
    public int arrangeCoins(int n) {
        // if you only have one coin, return 1
        // while loop until you run out of coins
        // each loop increase the number of steps/staircase you would have
        // subtract 1 coin from the total
        // have a variable where the subtracted number increases by 1 
        // (because with each step, there needs to be one more step than previous)
        // return the number of steps-1 because we only want complete stairs

        if (n==1){
            return 1;
        }
        int steps=0; 
        int max=1;
        while (n>=0){;
            steps++;
            n = n - max;
            max = max + 1;
        }
        return steps-1;
    }
}