// Last updated: 7/14/2026, 2:19:23 PM
class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend==-2147483648 && divisor == -1) return 2147483647;
        return dividend/divisor;

        
    }
}