// Last updated: 7/14/2026, 2:17:25 PM

class Solution {
     public boolean isPowerOfFour(int n) {
        if(n==1) return true;
        if(n<=0) return false;
        if(n%4!=0) return false;
        return isPowerOfFour(n/4);
        }
    
}