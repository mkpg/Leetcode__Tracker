// Last updated: 7/14/2026, 2:16:23 PM

class Solution {
    public int fib(int n) {
        if (n < 2) return n;
        int pp = 0;
        int p = 1;
        for (int i = 2; i < n + 1; i++) {
            int c = pp + p;
            pp = p;
            p = c;
        }
        return p;
    }
}