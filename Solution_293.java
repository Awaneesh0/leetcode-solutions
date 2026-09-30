class Solution {
    public boolean canWinNim(int n) {
        // You win as long as the number of stones is not a multiple of 4
        return n % 4 != 0;
    }
}