// Last updated: 7/14/2026, 2:17:22 PM
class Solution {
    public int getSum(int a, int b) {
        while (b != 0) {
            int c = (a & b) << 1;
            a ^= b;
            b = c;
        }   
        return a;     
    }
}